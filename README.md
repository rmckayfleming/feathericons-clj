# feathericons-clj

A ClojureScript library that provides [Feather Icons](https://github.com/feathericons/feather) as Hiccup data structures.

## Overview

This project downloads SVG files from the Feather Icons repository and converts them to ClojureScript files. Each icon is available as a function that returns a Hiccup data structure, making them easy to use in ClojureScript applications with Reagent, Re-frame, or any other Hiccup-compatible rendering library.

## Setup

1. Make sure you have [Clojure CLI tools](https://clojure.org/guides/getting_started) installed.
2. Clone this repository:
   ```
   git clone https://github.com/yourusername/feathericons-clj.git
   cd feathericons-clj
   ```
3. Run the setup script to download the Feather icons:
   ```
   ./setup.sh
   ```
   (This will clone the Feather Icons repository and copy the SVG files to the proper location)
4. Run the conversion process:
   ```
   clojure -M:run
   ```
   This will process all SVG files and generate the corresponding ClojureScript files under `src/feather/`.

## Usage

After building, each icon is available as its own namespace. For example:

```clojure
(ns my-app.core
  (:require [feather.alert-circle :as alert]
            [feather.arrow-right :as arrow]))

(defn my-component []
  [:div
   [alert/icon {:class "icon" :width 24 :height 24}]
   [arrow/icon {:stroke-width 2}]])
```

Each icon function accepts a map of properties that will be merged with the default SVG attributes:

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

- `deps.edn` contains all the necessary dependencies.
- `icons.clj` contains the logic for converting SVG files to ClojureScript.
- Generated files are placed in `src/feather/`.

## License

This project is distributed under the MIT License.

Feather Icons are licensed under the MIT License.
