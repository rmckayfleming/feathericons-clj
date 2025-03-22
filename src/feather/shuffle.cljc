(ns feather.shuffle)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "16 3 21 3 21 8"}] [:line {:x1 "4", :y1 "20", :x2 "21", :y2 "3"}] [:polyline {:points "21 16 21 21 16 21"}] [:line {:x1 "15", :y1 "15", :x2 "21", :y2 "21"}] [:line {:x1 "4", :y1 "4", :x2 "9", :y2 "9"}]]]
    (update default-svg 1 merge props)))