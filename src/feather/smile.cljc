(ns feather.smile)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "10"}] [:path {:d "M8 14s1.5 2 4 2 4-2 4-2"}] [:line {:x1 "9", :y1 "9", :x2 "9.01", :y2 "9"}] [:line {:x1 "15", :y1 "9", :x2 "15.01", :y2 "9"}]]]
    (update default-svg 1 merge props)))