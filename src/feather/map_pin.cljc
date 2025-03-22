(ns feather.map-pin)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M21 10c0 7-9 13-9 13s-9-6-9-13a9 9 0 0 1 18 0z"}] [:circle {:cx "12", :cy "10", :r "3"}]]]
    (update default-svg 1 merge props)))