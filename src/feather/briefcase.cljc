(ns feather.briefcase)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:rect {:x "2", :y "7", :width "20", :height "14", :rx "2", :ry "2"}] [:path {:d "M16 21V5a2 2 0 0 0-2-2h-4a2 2 0 0 0-2 2v16"}]]]
    (update default-svg 1 merge props)))