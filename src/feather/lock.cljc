(ns feather.lock)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "3", :y "11", :width "18", :height "11", :rx "2", :ry "2"}] [:path {:d "M7 11V7a5 5 0 0 1 10 0v4"}]]]
    (update default-svg 1 merge props)))