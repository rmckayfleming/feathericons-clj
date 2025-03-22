(ns feather.shield-off)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M19.69 14a6.9 6.9 0 0 0 .31-2V5l-8-3-3.16 1.18"}] [:path {:d "M4.73 4.73L4 5v7c0 6 8 10 8 10a20.29 20.29 0 0 0 5.62-4.38"}] [:line {:x1 "1", :y1 "1", :x2 "23", :y2 "23"}]]]
    (update default-svg 1 merge props)))