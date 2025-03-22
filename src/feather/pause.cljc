(ns feather.pause)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "6", :y "4", :width "4", :height "16"}] [:rect {:x "14", :y "4", :width "4", :height "16"}]]]
    (update default-svg 1 merge props)))