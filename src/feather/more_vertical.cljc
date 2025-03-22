(ns feather.more-vertical)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "12", :cy "12", :r "1"}] [:circle {:cx "12", :cy "5", :r "1"}] [:circle {:cx "12", :cy "19", :r "1"}]]]
    (update default-svg 1 merge props)))