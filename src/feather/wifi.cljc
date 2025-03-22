(ns feather.wifi)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M5 12.55a11 11 0 0 1 14.08 0"}] [:path {:d "M1.42 9a16 16 0 0 1 21.16 0"}] [:path {:d "M8.53 16.11a6 6 0 0 1 6.95 0"}] [:line {:x1 "12", :y1 "20", :x2 "12.01", :y2 "20"}]]]
    (update default-svg 1 merge props)))