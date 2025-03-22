(ns feather.crop)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M6.13 1L6 16a2 2 0 0 0 2 2h15"}] [:path {:d "M1 6.13L16 6a2 2 0 0 1 2 2v15"}]]]
    (update default-svg 1 merge props)))