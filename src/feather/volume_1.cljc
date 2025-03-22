(ns feather.volume-1)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:polygon {:points "11 5 6 9 2 9 2 15 6 15 11 19 11 5"}] [:path {:d "M15.54 8.46a5 5 0 0 1 0 7.07"}]]]
    (update default-svg 1 merge props)))