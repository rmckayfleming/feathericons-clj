(ns feather.coffee)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M18 8h1a4 4 0 0 1 0 8h-1"}] [:path {:d "M2 8h16v9a4 4 0 0 1-4 4H6a4 4 0 0 1-4-4V8z"}] [:line {:x1 "6", :y1 "1", :x2 "6", :y2 "4"}] [:line {:x1 "10", :y1 "1", :x2 "10", :y2 "4"}] [:line {:x1 "14", :y1 "1", :x2 "14", :y2 "4"}]]]
    (update default-svg 1 merge props)))