(ns feather.trending-down)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "23 18 13.5 8.5 8.5 13.5 1 6"}] [:polyline {:points "17 18 23 18 23 12"}]]]
    (update default-svg 1 merge props)))