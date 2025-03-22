(ns feather.chevrons-up)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "17 11 12 6 7 11"}] [:polyline {:points "17 18 12 13 7 18"}]]]
    (update default-svg 1 merge props)))