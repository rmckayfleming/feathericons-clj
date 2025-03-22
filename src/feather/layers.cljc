(ns feather.layers)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "12 2 2 7 12 12 22 7 12 2"}] [:polyline {:points "2 17 12 22 22 17"}] [:polyline {:points "2 12 12 17 22 12"}]]]
    (update default-svg 1 merge props)))