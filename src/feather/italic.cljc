(ns feather.italic)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "19", :y1 "4", :x2 "10", :y2 "4"}] [:line {:x1 "14", :y1 "20", :x2 "5", :y2 "20"}] [:line {:x1 "15", :y1 "4", :x2 "9", :y2 "20"}]]]
    (update default-svg 1 merge props)))