(ns feather.corner-right-down)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "10 15 15 20 20 15"}] [:path {:d "M4 4h7a4 4 0 0 1 4 4v12"}]]]
    (update default-svg 1 merge props)))