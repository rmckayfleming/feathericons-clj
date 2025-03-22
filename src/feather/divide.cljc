(ns feather.divide)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "6", :r "2"}] [:line {:x1 "5", :y1 "12", :x2 "19", :y2 "12"}] [:circle {:cx "12", :cy "18", :r "2"}]]]
    (update default-svg 1 merge props)))