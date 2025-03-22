(ns feather.arrow-down-left)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "17", :y1 "7", :x2 "7", :y2 "17"}] [:polyline {:points "17 17 7 17 7 7"}]]]
    (update default-svg 1 merge props)))