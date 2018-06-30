package algorithms.LinkedList.Doubly;

/* stores the overall properties of this list - perhaps its size.
   but more importantly, a reference to the first node in the list and the last node in the list
*/

public class MyLinkedList<E> {


    private Node<E> head;                      // these point to sentinel nodes...
    private Node<E> tail;
    private int size;

    //c
    public MyLinkedList() {

        head = new Node<E>(null);        // sentinel nodes with null data...
        tail = new Node<E>(null);
        size = 0;
        head = head.next = tail;
        tail = tail.prev = head;
    }

    //m
    public int size() {

    }

    public E get(int index) {

    }

    public E set(int index) {

    // add element to end of list.
        // null elements not allowed.

    }


    public boolean add(E element) {

    }

    public void add(int index, E element) throws IndexOutOfBoundsException {


    }

    public E remove(int index) throws IndexOutOfBoundsException {

    }




    //g&s
    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
