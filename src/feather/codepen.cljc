(ns feather.codepen)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "12 2 22 8.5 22 15.5 12 22 2 15.5 2 8.5 12 2"}] [:line {:x1 "12", :y1 "22", :x2 "12", :y2 "15.5"}] [:polyline {:points "22 8.5 12 15.5 2 8.5"}] [:polyline {:points "2 15.5 12 8.5 22 15.5"}] [:line {:x1 "12", :y1 "2", :x2 "12", :y2 "8.5"}]]]
    (update default-svg 1 merge props)))