(ns fizz-buzz.core-spec
  (:require [speclj.core :refer :all]
            [fizz-buzz.core :refer :all]))

(describe "fizz-buzz"
  (it "should return fizz if number divisible by 3"
    (should= "fizz" (fizz-buzz 3)))
  (it "should return buzz if number divisible by 5"
    (should= "buzz" (fizz-buzz 5)))
  (it "should return 1 if not divisible by 3"
    (should= 1 (fizz-buzz 1)))
  (it "should return 2 if number is not divisible by 3 or 5"
    (should= 2 (fizz-buzz 2)))
  (it "should return fizz if number divisble by 3"
    (should= "fizz" (fizz-buzz 6)))
  (it "should return buzz if number divisible by 5"
    (should= "buzz" (fizz-buzz 10)))
  (it "should return fizzbuzz if number is divisible by both 3 and 5"
    (should= "fizzbuzz" (fizz-buzz 30)))
  )

(describe "buzz-killer"
  (it "should return an empty list"
    (should= '() (buzz-killer 0)))
  (it "should return list of results from 1-10"
    (should= '(1, 2, "fizz", 4, "buzz","fizz",  7, 8, "fizz", "buzz") (buzz-killer 10)))
)
