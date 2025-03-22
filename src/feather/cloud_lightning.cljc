(ns feather.cloud-lightning)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M19 16.9A5 5 0 0 0 18 7h-1.26a8 8 0 1 0-11.62 9"}] [:polyline {:points "13 11 9 17 15 17 11 23"}]]]
    (update default-svg 1 merge props)))