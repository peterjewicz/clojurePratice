;returns the next item in list after th argument or nil

(ns practice)

(defn next-item
  "Returns the value that comes after item in xs or nil"
  [xs item]
     (def index (+ 1(.indexOf xs item)))
     (nth xs index)
  )
