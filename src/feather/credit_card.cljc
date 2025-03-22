(ns feather.credit-card)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "1", :y "4", :width "22", :height "16", :rx "2", :ry "2"}] [:line {:x1 "1", :y1 "10", :x2 "23", :y2 "10"}]]]
    (update default-svg 1 merge props)))