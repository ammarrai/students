package datastructures.LinkedList.Doubly;

/*
To make things easier, you can use dummy nodes which are pointed to by the head pointer and
the tail pointer of the list. This will also make inserting an element into the head (beginning)
a O(1) operation (adding to another location is still slow).

Also: as a designer of a LinkedLists You have the option to implement indexes is pointing to the data.
In the worst case, it will take O(n) to find it. i.e. we will need to follow O(n/2) from the head or the tail.
Much slower than an ArrayList

*/


public class Node<E> {

    //iv
    Node<E> next;
    Node<E> prev;
    E data;



    //c
    public Node(E data) {

        this.data = data;
    }


    public E get(int index) throws IndexOutOfBoundsException {

        return data;
    }


    //g&s
    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
