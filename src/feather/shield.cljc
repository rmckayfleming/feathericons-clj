(ns feather.shield)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M12 22s8-4 8-10V5l-8-3-8 3v7c0 6 8 10 8 10z"}]]]
    (update default-svg 1 merge props)))