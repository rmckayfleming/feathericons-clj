(ns feather.toggle-left)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "1", :y "5", :width "22", :height "14", :rx "7", :ry "7"}] [:circle {:cx "8", :cy "12", :r "3"}]]]
    (update default-svg 1 merge props)))