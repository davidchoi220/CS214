Script started on Tue 12 Mar 2019 11:27:06 PM EDT
wc25@gold18:~/CS214/projects/06$ cd clojure
wc25@gold18:~/CS214/projects/06/clojure$ cd src
wc25@gold18:~/CS214/projects/06/clojure/src$ cat array.clj
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

wc25@gold18:~/CS214/projects/06/clojure/src$ cd ..
wc25@gold18:~/CS214/projects/06/clojure$ clojure -m array
Enter the size of the array: 
4
Enter in value for array: 1 2 3 4
Enter in value for array: Enter in value for array: Enter in value for array: 
1.0
2.0
3.0
4.0
wc25@gold18:~/CS214/projects/06/clojure$ exit

Script done on Tue 12 Mar 2019 11:27:38 PM EDT
