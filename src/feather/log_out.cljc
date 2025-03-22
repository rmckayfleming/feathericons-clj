(ns feather.log-out)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M9 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h4"}] [:polyline {:points "16 17 21 12 16 7"}] [:line {:x1 "21", :y1 "12", :x2 "9", :y2 "12"}]]]
    (update default-svg 1 merge props)))