(ns feather.hash)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "4", :y1 "9", :x2 "20", :y2 "9"}] [:line {:x1 "4", :y1 "15", :x2 "20", :y2 "15"}] [:line {:x1 "10", :y1 "3", :x2 "8", :y2 "21"}] [:line {:x1 "16", :y1 "3", :x2 "14", :y2 "21"}]]]
    (update default-svg 1 merge props)))