(ns feather.chrome)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "10"}] [:circle {:cx "12", :cy "12", :r "4"}] [:line {:x1 "21.17", :y1 "8", :x2 "12", :y2 "8"}] [:line {:x1 "3.95", :y1 "6.06", :x2 "8.54", :y2 "14"}] [:line {:x1 "10.88", :y1 "21.94", :x2 "15.46", :y2 "14"}]]]
    (update default-svg 1 merge props)))