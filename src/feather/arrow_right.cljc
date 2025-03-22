(ns feather.arrow-right)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "5", :y1 "12", :x2 "19", :y2 "12"}] [:polyline {:points "12 5 19 12 12 19"}]]]
    (update default-svg 1 merge props)))