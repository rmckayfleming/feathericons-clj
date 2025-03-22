(ns feather.upload-cloud)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "16 16 12 12 8 16"}] [:line {:x1 "12", :y1 "12", :x2 "12", :y2 "21"}] [:path {:d "M20.39 18.39A5 5 0 0 0 18 9h-1.26A8 8 0 1 0 3 16.3"}] [:polyline {:points "16 16 12 12 8 16"}]]]
    (update default-svg 1 merge props)))