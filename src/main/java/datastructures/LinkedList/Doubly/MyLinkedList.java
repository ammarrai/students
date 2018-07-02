package datastructures.LinkedList.Doubly;


public class MyLinkedList<E> {

/*
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

        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Index does not exist");
        }
        Node<E> target = head;

        for (int i = 0; i <= index; i++) {
            target = target.next;
        }
        E value = target.data;
        return value;

    }


    public E set(int index, E element) {


    }



    public boolean add(E element) {

        if (element == null) {
            throw new NullPointerException("data must not be null");
        }

        try {
            Node<E> newNode = new Node<>(element);
            newNode.next = tail;
            newNode.prev = tail.prev;
            tail.prev.next = newNode;
            tail.prev = newNode;
            size++;
        } catch
                (Exception e) {
        }
        return true;
    }

/*
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

*/
}
