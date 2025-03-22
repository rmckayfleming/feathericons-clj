(ns feather.arrow-right-circle)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "10"}] [:polyline {:points "12 16 16 12 12 8"}] [:line {:x1 "8", :y1 "12", :x2 "16", :y2 "12"}]]]
    (update default-svg 1 merge props)))