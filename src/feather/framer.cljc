(ns feather.framer)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M5 16V9h14V2H5l14 14h-7m-7 0l7 7v-7m-7 0h7"}]]]
    (update default-svg 1 merge props)))