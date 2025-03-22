(ns feather.user-check)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M16 21v-2a4 4 0 0 0-4-4H5a4 4 0 0 0-4 4v2"}] [:circle {:cx "8.5", :cy "7", :r "4"}] [:polyline {:points "17 11 19 13 23 9"}]]]
    (update default-svg 1 merge props)))