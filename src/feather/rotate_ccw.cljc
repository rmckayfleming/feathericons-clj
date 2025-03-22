(ns feather.rotate-ccw)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "1 4 1 10 7 10"}] [:path {:d "M3.51 15a9 9 0 1 0 2.13-9.36L1 10"}]]]
    (update default-svg 1 merge props)))