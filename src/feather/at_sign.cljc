(ns feather.at-sign)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "4"}] [:path {:d "M16 8v5a3 3 0 0 0 6 0v-1a10 10 0 1 0-3.92 7.94"}]]]
    (update default-svg 1 merge props)))