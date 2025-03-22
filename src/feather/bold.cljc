(ns feather.bold)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M6 4h8a4 4 0 0 1 4 4 4 4 0 0 1-4 4H6z"}] [:path {:d "M6 12h9a4 4 0 0 1 4 4 4 4 0 0 1-4 4H6z"}]]]
    (update default-svg 1 merge props)))