(ns feather.send)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "22", :y1 "2", :x2 "11", :y2 "13"}] [:polygon {:points "22 2 15 22 11 13 2 9 22 2"}]]]
    (update default-svg 1 merge props)))