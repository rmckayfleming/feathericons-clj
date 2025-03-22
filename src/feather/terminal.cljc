(ns feather.terminal)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "4 17 10 11 4 5"}] [:line {:x1 "12", :y1 "19", :x2 "20", :y2 "19"}]]]
    (update default-svg 1 merge props)))