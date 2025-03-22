(ns feather.download-cloud)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "8 17 12 21 16 17"}] [:line {:x1 "12", :y1 "12", :x2 "12", :y2 "21"}] [:path {:d "M20.88 18.09A5 5 0 0 0 18 9h-1.26A8 8 0 1 0 3 16.29"}]]]
    (update default-svg 1 merge props)))