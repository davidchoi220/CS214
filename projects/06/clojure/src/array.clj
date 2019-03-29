;;;; array.clj creates an array, reads values, and prints it back out 
;;;;
;;;; Input: size of the array and the value(s) to be store in the array
;;;; Output: the value(s) in the array
;;;;
;;;; Completed by: David Choi
;;;; Date: 3-11-2014
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns array)      ; name the program

(defn printArray [aArray]
	(doseq [item aArray]
		(println item)
	)
)

(defn readArray [aArray aSize]
	(loop [i 0]
		(when (< i aSize)
			(print "Enter in value for array: ")(flush)
			(let [value(read)]
			(aset-float aArray i value)
			(recur(inc i)))
		)
	)
)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; main function
;;; Input: a, b, c
;;; Output: quadratic roots of given values
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn -main []
	(println "Enter the size of the array: ")(flush)
	(let
		[aSize(read)
		aArray(make-array Float/TYPE aSize)]
		aArray(readArray aArray aSize)
		(printArray aArray)
		) 
)

