(ns feather.bell-off)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M13.73 21a2 2 0 0 1-3.46 0"}] [:path {:d "M18.63 13A17.89 17.89 0 0 1 18 8"}] [:path {:d "M6.26 6.26A5.86 5.86 0 0 0 6 8c0 7-3 9-3 9h14"}] [:path {:d "M18 8a6 6 0 0 0-9.33-5"}] [:line {:x1 "1", :y1 "1", :x2 "23", :y2 "23"}]]]
    (update default-svg 1 merge props)))