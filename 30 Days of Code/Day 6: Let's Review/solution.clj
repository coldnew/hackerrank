#!/usr/bin/env boot

(loop [i 0
       n (Integer/parseInt (read-line))]
  (when (< i n)
    (let [c (seq (read-line))
          l (count c)]
      (loop [j 0]
        (when (< j l)
          (if (even? j)
            (print (nth c j)))
          (recur (inc j))))

      (print " ")

      (loop [j 0]
        (when (< j l)
          (if (odd? j)
            (print (nth c j)))
          (recur (inc j)))))

    (println "")

    (recur (inc i) n)))
