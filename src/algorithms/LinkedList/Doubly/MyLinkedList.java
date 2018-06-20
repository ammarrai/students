package algorithms.LinkedList.Doubly;

/* stores the overall properties of this list - perhaps its size.
   but more importantly, a reference to the first node in the list and the last node in the list
*/

public class MyLinkedList<E> {


    private Node<E> head;
    private Node<E> tail;
    private int size;

    //c
    public MyLinkedList() {

        head = new Node<E>(null);
        tail = new Node<E>(null);
        size = 0;
        head = head.next = tail;
        tail = tail.prev = head;
    }

    //m

    public size() {

    }

    public get() {

    }

    public set() {


    }

    public add() {

    }

    public remove() {

    }


    //g&s
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
