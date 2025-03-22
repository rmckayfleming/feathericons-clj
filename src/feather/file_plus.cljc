(ns feather.file-plus)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"}] [:polyline {:points "14 2 14 8 20 8"}] [:line {:x1 "12", :y1 "18", :x2 "12", :y2 "12"}] [:line {:x1 "9", :y1 "15", :x2 "15", :y2 "15"}]]]
    (update default-svg 1 merge props)))