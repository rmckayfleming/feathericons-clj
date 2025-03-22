(ns feather.divide-square)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "3", :y "3", :width "18", :height "18", :rx "2", :ry "2"}] [:line {:x1 "8", :y1 "12", :x2 "16", :y2 "12"}] [:line {:x1 "12", :y1 "16", :x2 "12", :y2 "16"}] [:line {:x1 "12", :y1 "8", :x2 "12", :y2 "8"}]]]
    (update default-svg 1 merge props)))