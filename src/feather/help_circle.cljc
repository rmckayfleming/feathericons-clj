(ns feather.help-circle)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "10"}] [:path {:d "M9.09 9a3 3 0 0 1 5.83 1c0 2-3 3-3 3"}] [:line {:x1 "12", :y1 "17", :x2 "12.01", :y2 "17"}]]]
    (update default-svg 1 merge props)))