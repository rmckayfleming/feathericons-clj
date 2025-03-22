(ns feather.archive)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "21 8 21 21 3 21 3 8"}] [:rect {:x "1", :y "3", :width "22", :height "5"}] [:line {:x1 "10", :y1 "12", :x2 "14", :y2 "12"}]]]
    (update default-svg 1 merge props)))