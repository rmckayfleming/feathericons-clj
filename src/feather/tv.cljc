(ns feather.tv)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "2", :y "7", :width "20", :height "15", :rx "2", :ry "2"}] [:polyline {:points "17 2 12 7 7 2"}]]]
    (update default-svg 1 merge props)))