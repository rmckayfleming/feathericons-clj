(ns feather.bell)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M18 8A6 6 0 0 0 6 8c0 7-3 9-3 9h18s-3-2-3-9"}] [:path {:d "M13.73 21a2 2 0 0 1-3.46 0"}]]]
    (update default-svg 1 merge props)))