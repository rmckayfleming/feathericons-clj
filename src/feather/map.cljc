(ns feather.map)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "1 6 1 22 8 18 16 22 23 18 23 2 16 6 8 2 1 6"}] [:line {:x1 "8", :y1 "2", :x2 "8", :y2 "18"}] [:line {:x1 "16", :y1 "6", :x2 "16", :y2 "22"}]]]
    (update default-svg 1 merge props)))