(ns fizz-buzz)

(defn divisible3or5 [num]
    (cond
        (= num 0) num
        (= (mod num 15) 0) "FizzBuzz"
        (= (mod num 5) 0) "Fizz"
        (= (mod num 3) 0) "Buzz"
        :else num)
)


(defn fizzBuzz []
        (def filterdNumbers (map divisible3or5 (into [] ( range 101))))
        ; for easy output only
        (list filterdNumbers)
)
