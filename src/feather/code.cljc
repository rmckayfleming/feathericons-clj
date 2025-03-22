(ns feather.code)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "16 18 22 12 16 6"}] [:polyline {:points "8 6 2 12 8 18"}]]]
    (update default-svg 1 merge props)))