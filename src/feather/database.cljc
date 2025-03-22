(ns feather.database)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:ellipse {:cx "12", :cy "5", :rx "9", :ry "3"}] [:path {:d "M21 12c0 1.66-4 3-9 3s-9-1.34-9-3"}] [:path {:d "M3 5v14c0 1.66 4 3 9 3s9-1.34 9-3V5"}]]]
    (update default-svg 1 merge props)))