(ns feather.slash)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "10"}] [:line {:x1 "4.93", :y1 "4.93", :x2 "19.07", :y2 "19.07"}]]]
    (update default-svg 1 merge props)))