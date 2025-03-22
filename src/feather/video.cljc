(ns feather.video)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "23 7 16 12 23 17 23 7"}] [:rect {:x "1", :y "5", :width "15", :height "14", :rx "2", :ry "2"}]]]
    (update default-svg 1 merge props)))