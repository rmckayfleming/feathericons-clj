(ns feather.git-commit)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "4"}] [:line {:x1 "1.05", :y1 "12", :x2 "7", :y2 "12"}] [:line {:x1 "17.01", :y1 "12", :x2 "22.96", :y2 "12"}]]]
    (update default-svg 1 merge props)))