(ns feather.maximize-2)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "15 3 21 3 21 9"}] [:polyline {:points "9 21 3 21 3 15"}] [:line {:x1 "21", :y1 "3", :x2 "14", :y2 "10"}] [:line {:x1 "3", :y1 "21", :x2 "10", :y2 "14"}]]]
    (update default-svg 1 merge props)))