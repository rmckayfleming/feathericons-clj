(ns feather.trending-up)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "23 6 13.5 15.5 8.5 10.5 1 18"}] [:polyline {:points "17 6 23 6 23 12"}]]]
    (update default-svg 1 merge props)))