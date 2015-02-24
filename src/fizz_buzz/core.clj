(ns fizz-buzz.core)

(defn fizz-buzz [x]
  (cond
    (and (= 0 (mod x 3)) (= 0 (mod x 5))) "fizzbuzz"
    (= 0 (mod x 3)) "fizz"
    (= 0 (mod x 5)) "buzz"
    :else x
    ))

(defn buzz-killer [x]
  (map fizz-buzz (range 1 (+ 1 x)))
)
