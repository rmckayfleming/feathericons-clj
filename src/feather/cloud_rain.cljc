(ns feather.cloud-rain)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "16", :y1 "13", :x2 "16", :y2 "21"}] [:line {:x1 "8", :y1 "13", :x2 "8", :y2 "21"}] [:line {:x1 "12", :y1 "15", :x2 "12", :y2 "23"}] [:path {:d "M20 16.58A5 5 0 0 0 18 7h-1.26A8 8 0 1 0 4 15.25"}]]]
    (update default-svg 1 merge props)))