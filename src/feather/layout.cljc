(ns feather.layout)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "3", :y "3", :width "18", :height "18", :rx "2", :ry "2"}] [:line {:x1 "3", :y1 "9", :x2 "21", :y2 "9"}] [:line {:x1 "9", :y1 "21", :x2 "9", :y2 "9"}]]]
    (update default-svg 1 merge props)))