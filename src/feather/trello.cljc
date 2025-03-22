(ns feather.trello)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "3", :y "3", :width "18", :height "18", :rx "2", :ry "2"}] [:rect {:x "7", :y "7", :width "3", :height "9"}] [:rect {:x "14", :y "7", :width "3", :height "5"}]]]
    (update default-svg 1 merge props)))