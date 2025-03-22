(ns feather.battery)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "1", :y "6", :width "18", :height "12", :rx "2", :ry "2"}] [:line {:x1 "23", :y1 "13", :x2 "23", :y2 "11"}]]]
    (update default-svg 1 merge props)))