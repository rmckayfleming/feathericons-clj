(ns feather.arrow-up)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "12", :y1 "19", :x2 "12", :y2 "5"}] [:polyline {:points "5 12 12 5 19 12"}]]]
    (update default-svg 1 merge props)))