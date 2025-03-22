(ns feather.percent)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "19", :y1 "5", :x2 "5", :y2 "19"}] [:circle {:cx "6.5", :cy "6.5", :r "2.5"}] [:circle {:cx "17.5", :cy "17.5", :r "2.5"}]]]
    (update default-svg 1 merge props)))