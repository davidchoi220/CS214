Script started on Tue 26 Feb 2019 05:22:48 PM EST
wc25@gold33:~/CS214/projects/04$ cd clojure
wc25@gold33:~/CS214/projects/04/clojure$ cd ..    scr  r cr  rc
wc25@gold33:~/CS214/projects/04/clojure/src$ cat factorial.clj
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
;;; -main is a 'driver' for the displayFactorial() functions.
;;; Input: n
;;; Output: n!
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn -main []
	(print "\nTo calculate n!, enter n: ") (flush)
	(let 
		[ n (int (read)) ]
		(print "Factorial of " n " is " (displayFactorial n))
		(println)
	)
)
wc25@gold33:~/CS214/projects/04/clojure/src$ cd ..
wc25@gold33:~/CS214/projects/04/clojure$ clojure -m factorial

To calculate n!, enter n: 4
Factorial of  4  is  24
wc25@gold33:~/CS214/projects/04/clojure$ exit

Script done on Tue 26 Feb 2019 05:23:27 PM EST
