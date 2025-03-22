(ns feather.minimize-2)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "4 14 10 14 10 20"}] [:polyline {:points "20 10 14 10 14 4"}] [:line {:x1 "14", :y1 "10", :x2 "21", :y2 "3"}] [:line {:x1 "3", :y1 "21", :x2 "10", :y2 "14"}]]]
    (update default-svg 1 merge props)))