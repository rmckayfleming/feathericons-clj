(ns feather.instagram)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "2", :y "2", :width "20", :height "20", :rx "5", :ry "5"}] [:path {:d "M16 11.37A4 4 0 1 1 12.63 8 4 4 0 0 1 16 11.37z"}] [:line {:x1 "17.5", :y1 "6.5", :x2 "17.51", :y2 "6.5"}]]]
    (update default-svg 1 merge props)))