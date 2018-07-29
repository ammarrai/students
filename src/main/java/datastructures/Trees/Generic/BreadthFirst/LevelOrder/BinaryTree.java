package datastructures.Trees.Generic.BreadthFirst.LevelOrder;

/*
           A
        B    C
      D  E  F  G

   Order Visited: A, B, C, D, E, F G


   visit: A
   visit: left: B | visit: right: C
   go back two steps to B
   visit: left: D | visit: right: E |
   go back two steps to C
   visit: left F | visit: right: G

   Keep track of the ones visited. The list(queue/FIFO) only holds 3 items at a time. if
   an element has a left and a right, remove that element from the list.

   Sequence:
   Queue: A
   Visit A
   Remove A from List.
   Does A have LEFT? yes: B | add to list
   Does A have RIGHT? yes: C | add to list
   Queue: BC
   Visit B
   Remove B from list.
   Does B have LEFT? yes: D | add to list
   Does B have RIGHT? yes: E | add to list
   Queue: CDE
   Visit C
   Remove C from list.
   Does C have LEFT? yes: F | add to list
   Does C have RIGHT? yes: G | add to list
   Queue: DEFG
   Visit D
   Remove D from list.
   Does D have LEFT? no.   Add null? or add nothing. hmm!
   Does D have RIGHT? no.
   visit E
   Remove E from list.
   Does E have LEFT? no.
   Does E have RIGHT? no.
   visit F
   Remove F from list.
   Does F have LEFT? no.
   Does F have RIGHT? no.
   visit G
   Remove G from list.
   Does G have LEFT? no.
   Does G have RIGHT? no.
   if nothing in queue, then end.
*/

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> {

    Node<E> root;

public void levelOrder() {

    Queue<Node<E>> q = new LinkedList<Node<E>>();
    q.add(root);
    while(!q.isEmpty());
    Node<E> curr = q.remove();
    if (curr != null) {

        curr.visit();
        q.add(curr.getLeft());    // alternatively, could check for nulls and not add.
        q.add(curr.getRight());
    }


}




}
