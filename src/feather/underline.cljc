(ns feather.underline)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M6 3v7a6 6 0 0 0 6 6 6 6 0 0 0 6-6V3"}] [:line {:x1 "4", :y1 "21", :x2 "20", :y2 "21"}]]]
    (update default-svg 1 merge props)))