(ns feather.eye)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M1 12s4-8 11-8 11 8 11 8-4 8-11 8-11-8-11-8z"}] [:circle {:cx "12", :cy "12", :r "3"}]]]
    (update default-svg 1 merge props)))