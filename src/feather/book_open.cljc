(ns feather.book-open)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M2 3h6a4 4 0 0 1 4 4v14a3 3 0 0 0-3-3H2z"}] [:path {:d "M22 3h-6a4 4 0 0 0-4 4v14a3 3 0 0 1 3-3h7z"}]]]
    (update default-svg 1 merge props)))