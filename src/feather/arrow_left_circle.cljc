(ns feather.arrow-left-circle)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "10"}] [:polyline {:points "12 8 8 12 12 16"}] [:line {:x1 "16", :y1 "12", :x2 "8", :y2 "12"}]]]
    (update default-svg 1 merge props)))