(ns feather.feather)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M20.24 12.24a6 6 0 0 0-8.49-8.49L5 10.5V19h8.5z"}] [:line {:x1 "16", :y1 "8", :x2 "2", :y2 "22"}] [:line {:x1 "17.5", :y1 "15", :x2 "9", :y2 "15"}]]]
    (update default-svg 1 merge props)))