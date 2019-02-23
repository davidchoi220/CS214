Script started on Fri 22 Feb 2019 07:51:53 PM EST
wc25@gold07:~/CS214/labs/04$ cd clojure
wc25@gold07:~/CS214/labs/04/clojure$ clojure -m logTable
To display a table of logarithms,
 enter the start, stop, and increment values: Exception in thread "main" clojure.lang.LispReader$ReaderException: java.lang.RuntimeException: EOF while reading
	at clojure.lang.LispReader.read(LispReader.java:304)
	at clojure.lang.LispReader.read(LispReader.java:206)
	at clojure.lang.LispReader.read(LispReader.java:200)
	at clojure.core$read.invokeStatic(core.clj:3758)
	at clojure.core$read.invokeStatic(core.clj:3733)
	at clojure.core$read.invokeStatic(core.clj:3733)
	at clojure.core$read.invokeStatic(core.clj:3733)
	at clojure.core$read.invoke(core.clj:3733)
	at logTable$_main.invokeStatic(logTable.clj:73)
	at logTable$_main.invoke(logTable.clj:69)
	at clojure.lang.AFn.applyToHelper(AFn.java:152)
	at clojure.lang.AFn.applyTo(AFn.java:144)
	at clojure.lang.Var.applyTo(Var.java:702)
	at clojure.core$apply.invokeStatic(core.clj:657)
	at clojure.main$main_opt.invokeStatic(main.clj:317)
	at clojure.main$main_opt.invoke(main.clj:313)
	at clojure.main$main.invokeStatic(main.clj:424)
	at clojure.main$main.doInvoke(main.clj:387)
	at clojure.lang.RestFn.applyTo(RestFn.java:137)
	at clojure.lang.Var.applyTo(Var.java:702)
	at clojure.main.main(main.java:37)
Caused by: java.lang.RuntimeException: EOF while reading
	at clojure.lang.Util.runtimeException(Util.java:221)
	at clojure.lang.LispReader.read(LispReader.java:258)
	... 20 more
wc25@gold07:~/CS214/labs/04/clojure$ clojure -m logTable                   cd ..
wc25@gold07:~/CS214/labs/04$ script script.clj
Script started, file is script.clj
wc25@gold07:~/CS214/labs/04$ cd s clojure
wc25@gold07:~/CS214/labs/04/clojure$ cd src
wc25@gold07:~/CS214/labs/04/clojure/src$ cat logTable.cjl  lj
;;;; logTable.clj displays a table of logarithms.
;;;;
;;;; Input: start, stop and increment, three numbers.
;;;; Precondition: start < stop && increment > 0.
;;;; Output: A table of logarithms from start to stop,
;;;;          with interval of increment.
;;;;
;;;; Begun by: Prof. Adams, for CS 214 at Calvin College.
;;;; Completed by: David Choi
;;;; Date: 2-22-2019
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(ns logTable)                                 ; name the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; displayLogTable() recursively generates the log-table.
;;; Receive: start the first value for the table;
;;;          stop, the last  value for the table;
;;;           step, the step value for the table;
;;; Precondition: start < stop && increment > 0.
;;; Output: The table of logs from start to stop, by step.
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; direct-recursive version

; replace this line with the definition of displayLogTable().
(defn displayLogTable [start stop increment]
	(if (<= start stop)
		(do
			(printf "The logarithm of %f is %f\n"
				start (Math/log10 start)
				displayLogTable (+ start increment) stop increment
			)
			
		)
	)
)

(defn displayLogTable2 [start stop increment]
	(loop [i start]
		(when (<= i stop)
			(printf "The logarithm of %f is %f\n"
				i (Math/log10 i)
			)
		(recur (+ i increment))
		)
	)
)

(defn displayLogTable3 [start stop increment]
	(if (<= start stop)
		(do
			(printf "The logarithm of %f is %f\n"
				start (Math/log10 start)

			)
		(recur (+ start increment) stop increment)		
		)
	)
)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; -main is a 'driver' for the displayLogTable() functions.
;;; Input: start, stop and increment.
;;; Output: The table of logarithms 
;;;          from start to stop by increment
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn -main []
 (println "To display a table of logarithms,")
 (print " enter the start, stop, and increment values: ") (flush)
 (let
    [ start (double (read))
      stop (double (read))
      increment (double (read))
    ] 
    (println)
    (displayLogTable start stop increment) 
    (println)
    (displayLogTable2 start stop increment) 
    (println)
    (displayLogTable3 start stop increment) 
    (println)
 )
)

wc25@gold07:~/CS214/labs/04/clojure/src$ cd ..
wc25@gold07:~/CS214/labs/04/clojure$ clojure -m logTable
To display a table of logarithms,
 enter the start, stop, and increment values: 1 5 0.5

The logarithm of 1.000000 is 0.000000

The logarithm of 1.000000 is 0.000000
The logarithm of 1.500000 is 0.176091
The logarithm of 2.000000 is 0.301030
The logarithm of 2.500000 is 0.397940
The logarithm of 3.000000 is 0.477121
The logarithm of 3.500000 is 0.544068
The logarithm of 4.000000 is 0.602060
The logarithm of 4.500000 is 0.653213
The logarithm of 5.000000 is 0.698970

The logarithm of 1.000000 is 0.000000
The logarithm of 1.500000 is 0.176091
The logarithm of 2.000000 is 0.301030
The logarithm of 2.500000 is 0.397940
The logarithm of 3.000000 is 0.477121
The logarithm of 3.500000 is 0.544068
The logarithm of 4.000000 is 0.602060
The logarithm of 4.500000 is 0.653213
The logarithm of 5.000000 is 0.698970

wc25@gold07:~/CS214/labs/04/clojure$ exit
Script done, file is script.clj
wc25@gold07:~/CS214/labs/04$ catcat script t.              cat script.java script.adb scriptrb        script clj script.rb > P roject04-results
cat: script: No such file or directory
cat: clj: No such file or directory
wc25@gold07:~/CS214/labs/04$ s2ps Project04-resultss[1@a[1P[1P[1@a
[Project04-results (plain): 3 pages on 2 sheets]
request id is Calvin_UniFLOW-10 (0 file(s))
[Total: 3 pages on 2 sheets] sent to the default printer
wc25@gold07:~/CS214/labs/04$ a2ps Project04-resultscat script.java script.adb script clj script.rb > Prroject04-results[A214/labs/04$ [34Pscript script.clj
[K[Awc25@gold07:~/CS214/labs/04$ script script.cljcat script.java script.adb script clj script.rb > Prroject04-results[Awc25@gold07:~/CS214/labs/04$ cat script.java script.adb script clj script.rb >  clj script.rb > Pro[1P[Ac25@gold07:~/CS214/labs/04$ cat script.java script.adb script.clj script.rb > Pr[1@o[A25@gold07:~/CS214/labs/04$ cat script.java script.adb script.

wc25@gold07:~/CS214/labs/04$ a2ps p Project04-s results
[Project04-results (plain): 4 pages on 2 sheets]
request id is Calvin_UniFLOW-11 (0 file(s))
[Total: 4 pages on 2 sheets] sent to the default printer
[1 line wrapped]
wc25@gold07:~/CS214/labs/04$ exit
