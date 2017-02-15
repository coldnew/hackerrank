#!/usr/bin/env boot

(defn solve-first [x y]
    (+ x y))

(def a (read-line))
(def b (read-line))

(println (solve-first (Integer/parseInt a) (Integer/parseInt b)))
