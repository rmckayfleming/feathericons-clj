(ns feather.repeat)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polyline {:points "17 1 21 5 17 9"}] [:path {:d "M3 11V9a4 4 0 0 1 4-4h14"}] [:polyline {:points "7 23 3 19 7 15"}] [:path {:d "M21 13v2a4 4 0 0 1-4 4H3"}]]]
    (update default-svg 1 merge props)))