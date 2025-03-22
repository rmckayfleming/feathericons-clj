(ns feather.mic-off)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:line {:x1 "1", :y1 "1", :x2 "23", :y2 "23"}] [:path {:d "M9 9v3a3 3 0 0 0 5.12 2.12M15 9.34V4a3 3 0 0 0-5.94-.6"}] [:path {:d "M17 16.95A7 7 0 0 1 5 12v-2m14 0v2a7 7 0 0 1-.11 1.23"}] [:line {:x1 "12", :y1 "19", :x2 "12", :y2 "23"}] [:line {:x1 "8", :y1 "23", :x2 "16", :y2 "23"}]]]
    (update default-svg 1 merge props)))