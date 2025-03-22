(ns feather.music)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M9 18V5l12-2v13"}] [:circle {:cx "6", :cy "18", :r "3"}] [:circle {:cx "18", :cy "16", :r "3"}]]]
    (update default-svg 1 merge props)))