(ns feather.pause-circle)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "10"}] [:line {:x1 "10", :y1 "15", :x2 "10", :y2 "9"}] [:line {:x1 "14", :y1 "15", :x2 "14", :y2 "9"}]]]
    (update default-svg 1 merge props)))