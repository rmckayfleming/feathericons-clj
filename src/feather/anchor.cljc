(ns feather.anchor)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "5", :r "3"}] [:line {:x1 "12", :y1 "22", :x2 "12", :y2 "8"}] [:path {:d "M5 12H2a10 10 0 0 0 20 0h-3"}]]]
    (update default-svg 1 merge props)))