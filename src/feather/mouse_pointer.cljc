(ns feather.mouse-pointer)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M3 3l7.07 16.97 2.51-7.39 7.39-2.51L3 3z"}] [:path {:d "M13 13l6 6"}]]]
    (update default-svg 1 merge props)))