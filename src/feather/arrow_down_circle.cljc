(ns feather.arrow-down-circle)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "10"}] [:polyline {:points "8 12 12 16 16 12"}] [:line {:x1 "12", :y1 "8", :x2 "12", :y2 "16"}]]]
    (update default-svg 1 merge props)))