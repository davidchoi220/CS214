;;;; Factorial.clj displays factorial value of n.
;;;;
;;;; Input:  n; an user input value.
;;;; Precondition: n >= 1.
;;;; Output: n!
;;;;
;;;; Completed by: David Choi
;;;; Date: 2-25-2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns factorial)                                 ; name the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; displayFactorial() factorial of its paramter n.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn displayFactorial [n]
	(if (< n 2)
		1
		(* n (displayFactorial (- n 1))) 
	)
)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; -main is a 'driver' for the displayLogTable() functions.
;;; Input: start, stop and increment.
;;; Output: The table of logarithms 
;;;          from start to stop by increment
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn -main []
	(print "\nTo calculate n!, enter n: ") (flush)
	(let 
		[ n (int (read)) ]
		(print "Factorial of " n " is " (displayFactorial n))
		(println)
	)
)
