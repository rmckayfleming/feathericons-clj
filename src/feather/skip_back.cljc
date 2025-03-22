(ns feather.skip-back)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "19 20 9 12 19 4 19 20"}] [:line {:x1 "5", :y1 "19", :x2 "5", :y2 "5"}]]]
    (update default-svg 1 merge props)))