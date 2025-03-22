(ns feather.rewind)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "11 19 2 12 11 5 11 19"}] [:polygon {:points "22 19 13 12 22 5 22 19"}]]]
    (update default-svg 1 merge props)))