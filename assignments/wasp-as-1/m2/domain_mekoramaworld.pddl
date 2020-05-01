;; The mekorama world (see https://www.youtube.com/watch?v=LH6qBnDpMUo).
;; Tile positions are encoded by the predicate (at <tile> <x> <y>), indicating
;; the coordinates of the head of the tile .
;; The predicate "inc"  encodes addition of positions.
(define (domain mekoramaworld)
  (:requirements :strips)
  (:predicates
   (pos ?p)
   (at ?t ?x ?y)
   (blank ?x ?y)
   (inc ?p ?p1)
   (ver2 ?t)
   (ver3 ?t)
   (hor2 ?t))

  (:action moveup-ver2
    :parameters (?t ?x ?y1 ?y2 ?y3)
    :precondition (and (ver2 ?t) (pos ?x) (pos ?y1) (pos ?y2) (pos ?y3)
                       (inc ?y1 ?y2) (inc ?y2 ?y3) (blank ?x ?y3)  (at ?t ?x ?y1))
    :effect (and (blank ?x ?y1) (at ?t ?x ?y2) (not (at ?t ?x ?y1)) (not (blank ?x ?y3))))

  (:action movedown-ver2
    :parameters (?t ?x ?y1 ?y2 ?y3)
    :precondition (and (ver2 ?t) (pos ?x) (pos ?y1) (pos ?y2) (pos ?y3)
                       (inc ?y1 ?y2) (inc ?y2 ?y3)
		       (blank ?x ?y1)  (at ?t ?x ?y2))
    :effect (and (blank ?x ?y3) (at ?t ?x ?y1) (not (at ?t ?x ?y2)) (not (blank ?x ?y1))))

  (:action moveup-ver3
    :parameters (?t ?x ?y1 ?y2 ?y3 ?y4)
    :precondition (and (ver3 ?t) (pos ?x) (pos ?y1) (pos ?y2) (pos ?y3) (pos ?y4)
                       (inc ?y1 ?y2) (inc ?y2 ?y3) (inc ?y3 ?y4)
		       (blank ?x ?y4) (at ?t ?x ?y2))
    :effect (and (blank ?x ?y1) (at ?t ?x ?y3) (not (at ?t ?x ?y2)) (not (blank ?x ?y4))))

  (:action movedown-ver3
    :parameters (?t ?x ?y1 ?y2 ?y3 ?y4)
    :precondition (and (ver3 ?t) (pos ?x) (pos ?y1) (pos ?y2) (pos ?y3) (pos ?y4)
                       (inc ?y1 ?y2) (inc ?y2 ?y3) (inc ?y3 ?y4)
		       (blank ?x ?y1) (at ?t ?x ?y3))
    :effect (and (blank ?x ?y4) (at ?t ?x ?y2) (not (at ?t ?x ?y3)) (not (blank ?x ?y1))))

  (:action moveright-hor2
    :parameters (?t ?x1 ?x2 ?x3 ?y)
    :precondition (and (hor2 ?t) (pos ?x1) (pos ?x2) (pos ?x3) (pos ?y)
                       (inc ?x1 ?x2) (inc ?x2 ?x3)
		       (blank ?x3 ?y) (at ?t ?x1 ?y))
    :effect (and (blank ?x1 ?y) (at ?t ?x2 ?y) (not (at ?t ?x1 ?y)) (not (blank ?x3 ?y))))

  (:action moveleft-hor2
    :parameters (?t ?x1 ?x2 ?x3 ?y)
    :precondition (and (hor2 ?t) (pos ?x1) (pos ?x2) (pos ?x3) (pos ?y)
                       (inc ?x1 ?x2) (inc ?x2 ?x3)
		       (blank ?x1 ?y) (at ?t ?x2 ?y))
    :effect (and (blank ?x3 ?y) (at ?t ?x1 ?y) (not (at ?t ?x2 ?y)) (not (blank ?x1 ?y)))))
