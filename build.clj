(ns build
  (:require [clojure.tools.build.api :as b]
            [clojure.java.io :as io]
            [hickory.core :as hickory]
            [clojure.string :as str]
            [clojure.walk :as walk]
            [clojure.java.shell :as shell]
            [clojure.data.json :as json]))

;;
;; SVG Transformation
;;

(defn fix-viewbox [hiccup]
  (walk/prewalk
   #(if (and (vector? %) (= :svg (first %)))
      (update % 1 (fn [attrs] (if (contains? attrs :viewbox)
                                (-> attrs
                                    (assoc :viewBox (:viewbox attrs))
                                    (dissoc :viewbox))
                                attrs)))
      %) 
   hiccup))

(defn svg->hiccup [svg-file]
  (-> svg-file
      slurp
      hickory/parse-fragment
      first
      hickory/as-hiccup
      fix-viewbox))

(defn feather-cleanup [hiccup]
  (letfn [(remove-stroke [attrs]
            (dissoc attrs :stroke :stroke-width))
          (update-node [node]
            (if (and (vector? node) (= :path (first node)))
              (update node 1 remove-stroke)
              node))]
    (walk/prewalk
     update-node
     (update hiccup 1 #(into % {:stroke "currentColor" :stroke-width 1.5})))))

(defn process-directory [input-dir output-dir prefix conversion-fn]
  (io/make-parents (str output-dir "/dummy.txt"))
  (doseq [svg-file (.listFiles (io/file input-dir))
          :when (.endsWith (.getName svg-file) ".svg")]
    (let [icon-name (str/replace (.getName svg-file) ".svg" "")
          file-name (str/replace icon-name "-" "_")
          ns-name (str prefix "." icon-name)
          hiccup (conversion-fn (svg->hiccup svg-file))
          cljc-content (str "(ns " ns-name ")\n\n"
                            "(defn icon [props]\n"
                            "  (let [default-svg " (pr-str hiccup) "]\n"
                            "    (update default-svg 1 merge props)))")]
      (spit (str output-dir "/" file-name ".cljc") cljc-content))))

;;
;; Repository management functions
;;

(defn clone-or-update-repo 
  "Clone the repository if it doesn't exist, or update it if it does"
  []
  (let [repo-url "https://github.com/feathericons/feather.git"
        repo-dir "resources/feather"]
    (if (.exists (io/file repo-dir))
      (do
        (println "Updating Feather Icons repository...")
        (shell/sh "git" "-C" repo-dir "pull"))
      (do
        (println "Cloning Feather Icons repository...")
        (shell/sh "git" "clone" repo-url repo-dir)))))

;;
;; Version Management
;;

(defn get-feather-version
  "Extract version from Feather's package.json file"
  []
  (let [package-json-path "resources/feather/package.json"]
    (if (.exists (io/file package-json-path))
      (-> package-json-path
          slurp
          (json/read-str :key-fn keyword)
          :version)
      (do
        (println "Warning: package.json not found, using default version")
        "unknown"))))

;;
;; Build tasks
;;

(def lib 'com.mckayfleming/feathericons-clj)
(def version (get-feather-version))
(def class-dir "target/classes")
(def basis (b/create-basis {:project "deps.edn"}))
(def jar-file "target/deploy.jar")

(defn clean [_]
  (b/delete {:path "resources/feather"})
  (println "Removed feather repo")
  (b/delete {:path "target"})
  (println "Cleaned build directories"))

(defn fetch-icons [_]
  (println "Fetching Feather Icons...")
  (clone-or-update-repo)
  (println "Feather Icons fetched successfully"))

(defn generate [_]
  (println "Generating CLJC files...")
  (let [base-in "resources/feather/icons/"
        base-out "src/feather/"]
    (process-directory base-in
                       base-out
                       "feather"
                       feather-cleanup))
  (println "CLJC generation completed!"))

(defn build [_]
  (println "Removing existing src files...")
  (b/delete {:path "src/feather"})
  (println "Building project...")
  (fetch-icons nil)
  (generate nil)
  (println "Build completed!"))

(defn jar [_]
  (b/copy-dir {:src-dirs ["src"]
               :target-dir class-dir})
  (b/write-pom {:class-dir class-dir
                :lib lib
                :version version
                :basis basis
                :src-dirs ["src"]
                :pom-data
                [[:licenses
                  [:license
                   [:name "MIT Licenses"]
                   [:url "https://spdx.org/licenses/MIT.html"]]]]})
  (b/jar {:class-dir class-dir
          :jar-file jar-file})
  (println "JAR created:" jar-file))

(defn install [_]
  (jar nil)
  (b/install {:basis basis
              :lib lib
              :version version
              :jar-file jar-file
              :class-dir class-dir})
  (println "Installed to local Maven repository"))

