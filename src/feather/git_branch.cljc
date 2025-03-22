(ns feather.git-branch)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "6", :y1 "3", :x2 "6", :y2 "15"}] [:circle {:cx "18", :cy "6", :r "3"}] [:circle {:cx "6", :cy "18", :r "3"}] [:path {:d "M18 9a9 9 0 0 1-9 9"}]]]
    (update default-svg 1 merge props)))