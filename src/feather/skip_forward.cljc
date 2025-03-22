(ns feather.skip-forward)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "5 4 15 12 5 20 5 4"}] [:line {:x1 "19", :y1 "5", :x2 "19", :y2 "19"}]]]
    (update default-svg 1 merge props)))