(ns ebay-calc)

(defn calcProfit [cost shipping]
        (def fees 0.871)
        ( + ( / ( + 0.3 cost) fees) shipping )
    )
