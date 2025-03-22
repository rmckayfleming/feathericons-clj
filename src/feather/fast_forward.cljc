(ns feather.fast-forward)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "13 19 22 12 13 5 13 19"}] [:polygon {:points "2 19 11 12 2 5 2 19"}]]]
    (update default-svg 1 merge props)))