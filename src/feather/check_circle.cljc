(ns feather.check-circle)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M22 11.08V12a10 10 0 1 1-5.93-9.14"}] [:polyline {:points "22 4 12 14.01 9 11.01"}]]]
    (update default-svg 1 merge props)))