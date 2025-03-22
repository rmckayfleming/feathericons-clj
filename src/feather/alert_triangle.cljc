(ns feather.alert-triangle)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M10.29 3.86L1.82 18a2 2 0 0 0 1.71 3h16.94a2 2 0 0 0 1.71-3L13.71 3.86a2 2 0 0 0-3.42 0z"}] [:line {:x1 "12", :y1 "9", :x2 "12", :y2 "13"}] [:line {:x1 "12", :y1 "17", :x2 "12.01", :y2 "17"}]]]
    (update default-svg 1 merge props)))