(ns feather.truck)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "1", :y "3", :width "15", :height "13"}] [:polygon {:points "16 8 20 8 23 11 23 16 16 16 16 8"}] [:circle {:cx "5.5", :cy "18.5", :r "2.5"}] [:circle {:cx "18.5", :cy "18.5", :r "2.5"}]]]
    (update default-svg 1 merge props)))