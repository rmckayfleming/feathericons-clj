(ns feather.chevrons-down)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "7 13 12 18 17 13"}] [:polyline {:points "7 6 12 11 17 6"}]]]
    (update default-svg 1 merge props)))