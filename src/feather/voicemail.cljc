(ns feather.voicemail)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:circle {:cx "5.5", :cy "11.5", :r "4.5"}] [:circle {:cx "18.5", :cy "11.5", :r "4.5"}] [:line {:x1 "5.5", :y1 "16", :x2 "18.5", :y2 "16"}]]]
    (update default-svg 1 merge props)))