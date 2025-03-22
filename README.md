# feathericons-clj

[![Clojars Project](https://img.shields.io/clojars/v/com.mckayfleming/match-bits.svg)](https://clojars.org/com.mckayfleming/feathericons-clj)

A ClojureScript library that provides [Feather Icons](https://github.com/feathericons/feather) as Hiccup data structures.

## Overview

This project downloads SVG files from the Feather Icons repository and converts them to ClojureScript files. Each icon is available as a function that returns a Hiccup data structure, making them easy to use in ClojureScript applications with Reagent, Re-frame, or any other Hiccup-compatible rendering library.

## Installation
For Clojure CLI/deps.edn:
```clojure
com.mckayfleming/match-bits {:mvn/version "RELEASE"}
```

For Leiningen/Boot projects:
```clojure
[com.mckayfleming/match-bits "RELEASE"]
```

## Usage

Each icon exists in its own namespace with a function `icon`.

```clojure
(ns my-app.core
  (:require [feather.alert-circle :as alert]
            [feather.arrow-right :as arrow]))

(defn my-component []
  [:div
   [alert/icon {:class "icon" :width 24 :height 24}]
   [arrow/icon {:stroke-width 2}]])
```

Properties passed in to the icon are merged with the default SVG attributes:

```clojure
;; Default SVG:
[:svg {:xmlns "http://www.w3.org/2000/svg" 
       :viewBox "0 0 24 24" 
       :stroke "currentColor" 
       :stroke-width 1.5} 
  [:path {:d "..." :fill "none"}]]

;; With custom properties:
[feather.arrow-right/icon {:width 32 :height 32 :stroke "red"}]
;; Results in:
[:svg {:xmlns "http://www.w3.org/2000/svg" 
       :viewBox "0 0 24 24" 
       :stroke "red" 
       :stroke-width 1.5
       :width 32
       :height 32} 
  [:path {:d "..." :fill "none"}]]
```

## Development

Running `clj -T:build build` will pull the feather repository, then fills out the src/feather directory with the converted files.

## License

This project is distributed under the MIT License.

Feather Icons are licensed under the MIT License.
