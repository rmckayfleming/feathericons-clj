(ns feather.zap-off)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "12.41 6.75 13 2 10.57 4.92"}] [:polyline {:points "18.57 12.91 21 10 15.66 10"}] [:polyline {:points "8 8 3 14 12 14 11 22 16 16"}] [:line {:x1 "1", :y1 "1", :x2 "23", :y2 "23"}]]]
    (update default-svg 1 merge props)))