(ns feather.filter)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "22 3 2 3 10 12.46 10 19 14 21 14 12.46 22 3"}]]]
    (update default-svg 1 merge props)))