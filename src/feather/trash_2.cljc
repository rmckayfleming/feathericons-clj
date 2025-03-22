(ns feather.trash-2)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "3 6 5 6 21 6"}] [:path {:d "M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"}] [:line {:x1 "10", :y1 "11", :x2 "10", :y2 "17"}] [:line {:x1 "14", :y1 "11", :x2 "14", :y2 "17"}]]]
    (update default-svg 1 merge props)))