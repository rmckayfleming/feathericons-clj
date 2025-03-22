(ns feather.x)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "18", :y1 "6", :x2 "6", :y2 "18"}] [:line {:x1 "6", :y1 "6", :x2 "18", :y2 "18"}]]]
    (update default-svg 1 merge props)))