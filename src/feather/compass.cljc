(ns feather.compass)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "10"}] [:polygon {:points "16.24 7.76 14.12 14.12 7.76 16.24 9.88 9.88 16.24 7.76"}]]]
    (update default-svg 1 merge props)))