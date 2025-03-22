(ns feather.crosshair)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "10"}] [:line {:x1 "22", :y1 "12", :x2 "18", :y2 "12"}] [:line {:x1 "6", :y1 "12", :x2 "2", :y2 "12"}] [:line {:x1 "12", :y1 "6", :x2 "12", :y2 "2"}] [:line {:x1 "12", :y1 "22", :x2 "12", :y2 "18"}]]]
    (update default-svg 1 merge props)))