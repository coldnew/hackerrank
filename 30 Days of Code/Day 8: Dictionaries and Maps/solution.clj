#!/usr/bin/env boot

(use '[clojure.string :only (split)])

(let [n_t (read-line)
      n (Integer/parseInt n_t)
      phonebook (atom nil)]

  ;; create phonebook data
  (loop [i 0]
    (when (< i n)
      (let [arr_temp (read-line)
            arr_t  (split arr_temp #"\s+")
            name   (first arr_t)
            number (last arr_t)]
        (swap! phonebook assoc-in [(keyword name)] number))
      (recur (inc i))))

  ;; query data
  (try (while true
         (let [query (read-line)
               number  ((keyword query) @phonebook)]
           (if number
             (println (str query "=" number))
             (println "Not found"))))
       (catch Exception e
         ;; do nothing, not sure why hackerrank give me null exception
         )))