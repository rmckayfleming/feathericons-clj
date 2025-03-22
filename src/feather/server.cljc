(ns feather.server)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "2", :y "2", :width "20", :height "8", :rx "2", :ry "2"}] [:rect {:x "2", :y "14", :width "20", :height "8", :rx "2", :ry "2"}] [:line {:x1 "6", :y1 "6", :x2 "6.01", :y2 "6"}] [:line {:x1 "6", :y1 "18", :x2 "6.01", :y2 "18"}]]]
    (update default-svg 1 merge props)))