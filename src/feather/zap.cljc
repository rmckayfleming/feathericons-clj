(ns feather.zap)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "13 2 3 14 12 14 11 22 21 10 12 10 13 2"}]]]
    (update default-svg 1 merge props)))