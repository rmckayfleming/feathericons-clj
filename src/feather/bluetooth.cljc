(ns feather.bluetooth)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "6.5 6.5 17.5 17.5 12 23 12 1 17.5 6.5 6.5 17.5"}]]]
    (update default-svg 1 merge props)))