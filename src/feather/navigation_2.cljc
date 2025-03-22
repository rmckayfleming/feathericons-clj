(ns feather.navigation-2)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "12 2 19 21 12 17 5 21 12 2"}]]]
    (update default-svg 1 merge props)))