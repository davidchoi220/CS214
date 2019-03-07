;;;; quad.clj calculates the quadrativ value of an equation
;;;;
;;;; Input: value a, b, c
;;;; Output: the quadratic value
;;;;
;;;; Completed by: David Choi
;;;; Date: 3-4-2014
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns quad)      ; name the program

(defn quadratic [a b c]
  (if (not (= a 0.0))
    (let [ arg (- (Math/pow b 2.0) (* 4.0 (* a c)))]
      (if (>= arg 0.0)
        (vector (/ (+ (- b) (Math/sqrt arg)) (* 2.0 a)) (/ (- (- b) (Math/sqrt arg)) (* 2.0 a)) true)
        (vector 0.0 0.0 false 1)
        )
      )
  (vector 0.0 0.0 false 2))
)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; main function
;;; Input: a, b, c
;;; Output: quadratic roots of given values
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn -main []
  (println "Please enter a, b, c: ") (flush)
  (let
    [
      a (Double/parseDouble (read-line))
      b (Double/parseDouble (read-line))
      c (Double/parseDouble (read-line))

      result (quadratic a b c)
      r1 (get result 0)
      r2 (get result 1)
      flag (get result 2)
      error (get result 3)
    ]
    (if flag
      (println "The roots are: " (str r1) (str r2))
      (if (= error 1) (print "\nError: quadRoots(): b^2 - 4ac is negative!\n")
        (print "\nError: quadRoots():: a is zero!\n")
      )
    )
  )
)

