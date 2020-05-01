(define (problem mekorama26)   ;; this is a skeleton to a problem file for the mekorama26 puzzle
   (:domain mekoramaworld)
   (:objects t1 t2 t3 t4 t5 t6 t7 x1 x2 x3 x4 x5 x6 y1 y2 y3 y4 y5 y6)   ;; all objects
   (:init
      ;; positions and their relations
      (pos x1) (pos x2) (pos x3) (pos x4) (pos x5) (pos x6)
      (pos y1) (pos y2) (pos y3) (pos y4) (pos y5) (pos y6)
	  (inc x1 x2) (inc x2 x3) (inc x3 x4) (inc x4 x5) (inc x5 x6)
	  (inc y1 y2) (inc y2 y3) (inc y3 y4) (inc y4 y5) (inc y5 y6)
	  
	  ;; initial positions of the tiles
	  (hor2 t1) (at t1 x1 y4)
	  (ver3 t2) (at t2 x3 y4)
	  (ver3 t3) (at t3 x4 y5)
	  (hor2 t4) (at t4 x4 y3)
	  (ver3 t5) (at t5 x6 y3)
	  (ver2 t6) (at t6 x2 y1)
	  (hor2 t7) (at t7 x5 y1)
	  
	  ;; initial positions of blank slots
	  (blank x1 y6) (blank x2 y6) (blank x3 y6) (blank x5 y6) (blank x6 y6)
	  (blank x1 y5) (blank x2 y5) (blank x5 y5) (blank x6 y5)
	  (blank x5 y4)
	  (blank x1 y3) (blank x2 y3)
	  (blank x1 y2) (blank x3 y2) (blank x4 y2) (blank x5 y2)
	  (blank x1 y1) (blank x3 y1) (blank x4 y1))
	  
   (:goal (at t1 x5 y4)))   ;; goal is to move tile t1 to the exit at x5 y4 
   