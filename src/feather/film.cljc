(ns feather.film)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "2", :y "2", :width "20", :height "20", :rx "2.18", :ry "2.18"}] [:line {:x1 "7", :y1 "2", :x2 "7", :y2 "22"}] [:line {:x1 "17", :y1 "2", :x2 "17", :y2 "22"}] [:line {:x1 "2", :y1 "12", :x2 "22", :y2 "12"}] [:line {:x1 "2", :y1 "7", :x2 "7", :y2 "7"}] [:line {:x1 "2", :y1 "17", :x2 "7", :y2 "17"}] [:line {:x1 "17", :y1 "17", :x2 "22", :y2 "17"}] [:line {:x1 "17", :y1 "7", :x2 "22", :y2 "7"}]]]
    (update default-svg 1 merge props)))