(ns feather.alert-octagon)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "7.86 2 16.14 2 22 7.86 22 16.14 16.14 22 7.86 22 2 16.14 2 7.86 7.86 2"}] [:line {:x1 "12", :y1 "8", :x2 "12", :y2 "12"}] [:line {:x1 "12", :y1 "16", :x2 "12.01", :y2 "16"}]]]
    (update default-svg 1 merge props)))