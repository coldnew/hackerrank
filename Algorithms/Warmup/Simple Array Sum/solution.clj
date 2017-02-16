#!/usr/bin/env boot

(use '[clojure.string :only (split triml)])

(
 let [
      n_t (read-line)
      n (Integer/parseInt n_t)
      ]

 (
  let [
       arr_temp (read-line)
       arr_t (split arr_temp #"\s+")
       arr (map #(Integer/parseInt %) arr_t)
       ]

  ;; Solutions
  (println (reduce + (take n arr)))

  )
 )
