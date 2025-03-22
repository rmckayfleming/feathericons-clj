(ns feather.twitch)

(defn icon [props]
  (let [default-svg [:svg {:stroke "currentColor", :fill "none", :stroke-linejoin "round", :width "24", :xmlns "http://www.w3.org/2000/svg", :stroke-linecap "round", :stroke-width 1.5, :viewBox "0 0 24 24", :height "24"} [:path {:d "M21 2H3v16h5v4l4-4h5l4-4V2zm-10 9V7m5 4V7"}]]]
    (update default-svg 1 merge props)))