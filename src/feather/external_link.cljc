(ns feather.external-link)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M18 13v6a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h6"}] [:polyline {:points "15 3 21 3 21 9"}] [:line {:x1 "10", :y1 "14", :x2 "21", :y2 "3"}]]]
    (update default-svg 1 merge props)))