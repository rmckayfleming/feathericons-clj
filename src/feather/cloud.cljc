(ns feather.cloud)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M18 10h-1.26A8 8 0 1 0 9 20h9a5 5 0 0 0 0-10z"}]]]
    (update default-svg 1 merge props)))