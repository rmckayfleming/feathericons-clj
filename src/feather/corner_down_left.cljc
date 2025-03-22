(ns feather.corner-down-left)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "9 10 4 15 9 20"}] [:path {:d "M20 4v7a4 4 0 0 1-4 4H4"}]]]
    (update default-svg 1 merge props)))