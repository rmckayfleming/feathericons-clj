(ns feather.droplet)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M12 2.69l5.66 5.66a8 8 0 1 1-11.31 0z"}]]]
    (update default-svg 1 merge props)))