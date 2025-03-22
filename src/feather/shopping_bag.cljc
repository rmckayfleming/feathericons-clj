(ns feather.shopping-bag)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M6 2L3 6v14a2 2 0 0 0 2 2h14a2 2 0 0 0 2-2V6l-3-4z"}] [:line {:x1 "3", :y1 "6", :x2 "21", :y2 "6"}] [:path {:d "M16 10a4 4 0 0 1-8 0"}]]]
    (update default-svg 1 merge props)))