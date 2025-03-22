(ns feather.search)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "11", :cy "11", :r "8"}] [:line {:x1 "21", :y1 "21", :x2 "16.65", :y2 "16.65"}]]]
    (update default-svg 1 merge props)))