(ns feather.smartphone)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "5", :y "2", :width "14", :height "20", :rx "2", :ry "2"}] [:line {:x1 "12", :y1 "18", :x2 "12.01", :y2 "18"}]]]
    (update default-svg 1 merge props)))