(ns feather.type)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "4 7 4 4 20 4 20 7"}] [:line {:x1 "9", :y1 "20", :x2 "15", :y2 "20"}] [:line {:x1 "12", :y1 "4", :x2 "12", :y2 "20"}]]]
    (update default-svg 1 merge props)))