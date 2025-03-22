(ns feather.menu)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "3", :y1 "12", :x2 "21", :y2 "12"}] [:line {:x1 "3", :y1 "6", :x2 "21", :y2 "6"}] [:line {:x1 "3", :y1 "18", :x2 "21", :y2 "18"}]]]
    (update default-svg 1 merge props)))