(ns feather.loader)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "12", :y1 "2", :x2 "12", :y2 "6"}] [:line {:x1 "12", :y1 "18", :x2 "12", :y2 "22"}] [:line {:x1 "4.93", :y1 "4.93", :x2 "7.76", :y2 "7.76"}] [:line {:x1 "16.24", :y1 "16.24", :x2 "19.07", :y2 "19.07"}] [:line {:x1 "2", :y1 "12", :x2 "6", :y2 "12"}] [:line {:x1 "18", :y1 "12", :x2 "22", :y2 "12"}] [:line {:x1 "4.93", :y1 "19.07", :x2 "7.76", :y2 "16.24"}] [:line {:x1 "16.24", :y1 "7.76", :x2 "19.07", :y2 "4.93"}]]]
    (update default-svg 1 merge props)))