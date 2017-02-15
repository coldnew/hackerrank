#!/usr/bin/env boot

(let [lst [3
           2
           4
           6
           5
           7
           8
           0
           1]]
  ;; solutions
  (reduce + (filter odd? lst))
  )
