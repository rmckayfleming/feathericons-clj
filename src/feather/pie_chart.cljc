(ns feather.pie-chart)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M21.21 15.89A10 10 0 1 1 8 2.83"}] [:path {:d "M22 12A10 10 0 0 0 12 2v10z"}]]]
    (update default-svg 1 merge props)))