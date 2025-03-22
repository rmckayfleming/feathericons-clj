(ns feather.log-in)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M15 3h4a2 2 0 0 1 2 2v14a2 2 0 0 1-2 2h-4"}] [:polyline {:points "10 17 15 12 10 7"}] [:line {:x1 "15", :y1 "12", :x2 "3", :y2 "12"}]]]
    (update default-svg 1 merge props)))