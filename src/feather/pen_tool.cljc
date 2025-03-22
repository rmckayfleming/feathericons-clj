(ns feather.pen-tool)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M12 19l7-7 3 3-7 7-3-3z"}] [:path {:d "M18 13l-1.5-7.5L2 2l3.5 14.5L13 18l5-5z"}] [:path {:d "M2 2l7.586 7.586"}] [:circle {:cx "11", :cy "11", :r "2"}]]]
    (update default-svg 1 merge props)))