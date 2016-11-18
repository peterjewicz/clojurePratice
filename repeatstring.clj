;repeats a string N times

(ns clojure.string-repeat)

(defn repeat-str [n strng]
    (apply str (repeat n strng))
)
