(ns feather.rss)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M4 11a9 9 0 0 1 9 9"}] [:path {:d "M4 4a16 16 0 0 1 16 16"}] [:circle {:cx "5", :cy "19", :r "1"}]]]
    (update default-svg 1 merge props)))