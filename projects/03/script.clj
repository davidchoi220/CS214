Script started on Mon 18 Feb 2019 10:36:56 PM EST
wc25@gold22:~/CS214/projects/03$ cd clojure
wc25@gold22:~/CS214/projects/03/clojure$ cd src
wc25@gold22:~/CS214/projects/03/clojure/src$ cat grades.clj
;;;; grades.clj is a driver for function letterGrade.
;;;;
;;;; Input: A grade, a number between 0 to 100.
;;;; Output: The letter for that grade
;;;;  
;;;; Usage: clojure -m grades
;;;;
;;;; Begun by: David Choi, for CS 214 at Calvin College.
;;;; Completed by: David Choi
;;;; Date:02-18-2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns grades)                    ; name the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; grades() returns the letter grade for a given grade.
;;; Receive: grade, an Integer.
;;; Precondition: grade is a number between 
;;;   {0 to 100}.
;;; Return: the char corresponding to the grade.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn letterGrade[grade]
	(cond
		(>= grade 90) "A"
		(>= grade 80) "B"
		(>= grade 70) "C"
		(>= grade 60) "D"
		:else "F"
		))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Function -main() test-drives our letterGrade() function.
;;; Input: grade: one between {0-100}.
;;; Output: the letter grade corresponding to the grade.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn -main []
 (print "\nEnter your grade: ") (flush)
 (let
    [ grade (read) ]                ; read grade (an int)
    (println (letterGrade grade) "\n")      ; display its code
 )
)

wc25@gold22:~/CS214/projects/03/clojure/src$ cd ..
wc25@gold22:~/CS214/projects/03/clojure$ clojure -m grades

Enter your grade: 99
A 

wc25@gold22:~/CS214/projects/03/clojure$ clojure -m grades

Enter your grade: 88
B 

wc25@gold22:~/CS214/projects/03/clojure$ clojure -m grades

Enter your grade: 77
C 

wc25@gold22:~/CS214/projects/03/clojure$ clojure -m grades

Enter your grade: 66
D 

wc25@gold22:~/CS214/projects/03/clojure$ clojure -m grades

Enter your grade: 55
F 

wc25@gold22:~/CS214/projects/03/clojure$ exit

Script done on Mon 18 Feb 2019 10:37:47 PM EST
