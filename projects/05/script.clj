Script started on Tue 05 Mar 2019 11:22:56 PM EST
wc25@gold30:~/CS214/projects/05$ cd slojure       clojure
wc25@gold30:~/CS214/projects/05/clojure$ cd src
wc25@gold30:~/CS214/projects/05/clojure/src$ cat quad.clj
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
        (print "\nError: quadRoots():: a is zero!"\n")
      )
    )
  )
)

wc25@gold30:~/CS214/projects/05/clojure/src$ cd ..
wc25@gold30:~/CS214/projects/05/clojure$ clojure -m quad
Exception in thread "main" java.lang.RuntimeException: EOF while reading string, compiling:(quad.clj:52:1)
	at clojure.lang.Compiler.load(Compiler.java:7521)
	at clojure.lang.RT.loadResourceScript(RT.java:379)
	at clojure.lang.RT.loadResourceScript(RT.java:370)
	at clojure.lang.RT.load(RT.java:460)
	at clojure.lang.RT.load(RT.java:426)
	at clojure.core$load$fn__6548.invoke(core.clj:6046)
	at clojure.core$load.invokeStatic(core.clj:6045)
	at clojure.core$load.doInvoke(core.clj:6029)
	at clojure.lang.RestFn.invoke(RestFn.java:408)
	at clojure.core$load_one.invokeStatic(core.clj:5848)
	at clojure.core$load_one.invoke(core.clj:5843)
	at clojure.core$load_lib$fn__6493.invoke(core.clj:5888)
	at clojure.core$load_lib.invokeStatic(core.clj:5887)
	at clojure.core$load_lib.doInvoke(core.clj:5868)
	at clojure.lang.RestFn.applyTo(RestFn.java:142)
	at clojure.core$apply.invokeStatic(core.clj:659)
	at clojure.core$load_libs.invokeStatic(core.clj:5925)
	at clojure.core$load_libs.doInvoke(core.clj:5909)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.core$apply.invokeStatic(core.clj:659)
	at clojure.core$require.invokeStatic(core.clj:5947)
	at clojure.main$main_opt.invokeStatic(main.clj:317)
	at clojure.main$main_opt.invoke(main.clj:313)
	at clojure.main$main.invokeStatic(main.clj:424)
	at clojure.main$main.doInvoke(main.clj:387)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.lang.Var.applyTo(Var.java:702)
	at clojure.main.main(main.java:37)
Caused by: java.lang.RuntimeException: EOF while reading string
	at clojure.lang.Util.runtimeException(Util.java:221)
	at clojure.lang.LispReader$StringReader.invoke(LispReader.java:553)
	at clojure.lang.LispReader.read(LispReader.java:275)
	at clojure.lang.LispReader.readDelimitedList(LispReader.java:1384)
	at clojure.lang.LispReader$ListReader.invoke(LispReader.java:1232)
	at clojure.lang.LispReader.read(LispReader.java:275)
	at clojure.lang.LispReader.readDelimitedList(LispReader.java:1384)
	at clojure.lang.LispReader$ListReader.invoke(LispReader.java:1232)
	at clojure.lang.LispReader.read(LispReader.java:275)
	at clojure.lang.LispReader.readDelimitedList(LispReader.java:1384)
	at clojure.lang.LispReader$ListReader.invoke(LispReader.java:1232)
	at clojure.lang.LispReader.read(LispReader.java:275)
	at clojure.lang.LispReader.readDelimitedList(LispReader.java:1384)
	at clojure.lang.LispReader$ListReader.invoke(LispReader.java:1232)
	at clojure.lang.LispReader.read(LispReader.java:275)
	at clojure.lang.LispReader.readDelimitedList(LispReader.java:1384)
	at clojure.lang.LispReader$ListReader.invoke(LispReader.java:1232)
	at clojure.lang.LispReader.read(LispReader.java:275)
	at clojure.lang.LispReader.read(LispReader.java:206)
	at clojure.lang.Compiler.load(Compiler.java:7509)
	... 27 more
wc25@gold30:~/CS214/projects/05/clojure$ cd ..
wc25@gold30:~/CS214/projects/05$ scti    scrip     script script.clj
Script started, file is script.clj
wc25@gold30:~/CS214/projects/05$ cd slo   clojure
wc25@gold30:~/CS214/projects/05/clojure$ cd src
wc25@gold30:~/CS214/projects/05/clojure/src$ cat quad.clj
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

wc25@gold30:~/CS214/projects/05/clojure/src$ cd ..
wc25@gold30:~/CS214/projects/05/clojure$ clojure -m quad
Please enter a, b, c: 
5
5
5

Error: quadRoots(): b^2 - 4ac is negative!
wc25@gold30:~/CS214/projects/05/clojure$ clojure -m quad
5
Please enter a, b, c: 
6
1
The roots are:  -0.2 -1.0
wc25@gold30:~/CS214/projects/05/clojure$ exit
Script done, file is script.clj
wc25@gold30:~/CS214/projects/05$ cd    script script.rb
Script started, file is script.rb
wc25@gold30:~/CS214/projects/05$ cat quad.rb
# quad.rb computes the quadratic roots of a, b, and c
#
# Input: double a, b, c
# Output: quadratic roots
#
# Begun by: Prof. Adams, for CS 214 at Calvin College.
# Completed by: David Choi
# Date: 3-4-2019
#################################################################


def quad(a, b, c)
	if a != 0
		arg = (b**2) - (4 * a * c)
		if arg > -1
			[(-b + Math.sqrt(arg))/(2*a), (-b -Math.sqrt(arg))/(2*a), true, 0]
		else 
			[0, 0, false, 1]
		end
	else 
		[0, 0, false, 2]
	end
end


if __FILE__ == $0
  print "Enter the value for a: "
  a = gets.to_f
  print "Enter the value for b: "
  b = gets.to_f
  print "Enter the value for c: "
  c = gets.to_f
  
  roots = quad(a, b, c)


  if(roots[2])
  	puts "The roots are " << roots[0].to_s << " and " << roots[1].to_s
  else
  	if (roots[3] == 1)
  		puts "Error: quadRoots(): b^2 - 4ac is negative! \n"
  	else
  		puts "Error: quadRoots():: a is zero! \n"
  	end

end
end
wc25@gold30:~/CS214/projects/05$ ruby quad.rb
Enter the value for a: 5
Enter the value for b: 5
Enter the value for c: 5
Error: quadRoots(): b^2 - 4ac is negative! 
wc25@gold30:~/CS214/projects/05$ ruby quad.rb
Enter the value for a: 5
Enter the value for b: 6
Enter the value for c: 1
The roots are -0.2 and -1.0
wc25@gold30:~/CS214/projects/05$ exit
Script done, file is script.rb
wc25@gold30:~/CS214/projects/05$ cat script.java script.adb script.clj script.rb  > Project04 5-results
wc25@gold30:~/CS214/projects/05$ a2ps Project05-results
[Project05-results (plain): 5 pages on 3 sheets]
request id is Calvin_UniFLOW-45 (0 file(s))
[Total: 5 pages on 3 sheets] sent to the default printer
[8 lines wrapped]
wc25@gold30:~/CS214/projects/05$ exit
