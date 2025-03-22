(ns feather.rotate-cw)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "23 4 23 10 17 10"}] [:path {:d "M20.49 15a9 9 0 1 1-2.12-9.36L23 10"}]]]
    (update default-svg 1 merge props)))