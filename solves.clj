(* 
   (- 
      (+ 1,(*,2,3))
      (/,(+,5,6),(-,7,8)
         2)))


(- 
   (/, 
      (*,12,12),(-,4,2))
   (*,9,9))

(def p1 (list '+ 1 2))
(eval p1)

(def p2 (list 'println "tada"))
(eval p2)

(def p3 (list 'reverse "Hallo, Welt!"))
(eval p3)


(def p4 (list '+ 1 (list '* 2 3)))
(eval p4)

(defn quadrat [x] (*,x,x))
(quadrat 8)


(- (/ (quadrat 12) (-,4,2)) (quadrat 9))

(defn my-f [x]  
  (loop [i 1 , prod 1]
    (if (> i  x) prod 
      (recur (+ 1 i)(* prod i)))))
(my-f 5)
  

(for [i (range 10) :when (even? i) k [10 20]]  (+ i k))
(defn add1 [x,l] (+ x 10))
(defn add2 [x] (+ x 20))
(map add1 (range 10))

(filter even? (range 10))




