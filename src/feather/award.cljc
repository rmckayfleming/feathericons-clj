(ns feather.award)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "8", :r "7"}] [:polyline {:points "8.21 13.89 7 23 12 20 17 23 15.79 13.88"}]]]
    (update default-svg 1 merge props)))