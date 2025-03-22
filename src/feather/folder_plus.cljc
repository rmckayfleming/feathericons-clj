(ns feather.folder-plus)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M22 19a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h5l2 3h9a2 2 0 0 1 2 2z"}] [:line {:x1 "12", :y1 "11", :x2 "12", :y2 "17"}] [:line {:x1 "9", :y1 "14", :x2 "15", :y2 "14"}]]]
    (update default-svg 1 merge props)))