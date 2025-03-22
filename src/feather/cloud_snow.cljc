(ns feather.cloud-snow)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M20 17.58A5 5 0 0 0 18 8h-1.26A8 8 0 1 0 4 16.25"}] [:line {:x1 "8", :y1 "16", :x2 "8.01", :y2 "16"}] [:line {:x1 "8", :y1 "20", :x2 "8.01", :y2 "20"}] [:line {:x1 "12", :y1 "18", :x2 "12.01", :y2 "18"}] [:line {:x1 "12", :y1 "22", :x2 "12.01", :y2 "22"}] [:line {:x1 "16", :y1 "16", :x2 "16.01", :y2 "16"}] [:line {:x1 "16", :y1 "20", :x2 "16.01", :y2 "20"}]]]
    (update default-svg 1 merge props)))