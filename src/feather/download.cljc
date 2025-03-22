(ns feather.download)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4"}] [:polyline {:points "7 10 12 15 17 10"}] [:line {:x1 "12", :y1 "15", :x2 "12", :y2 "3"}]]]
    (update default-svg 1 merge props)))