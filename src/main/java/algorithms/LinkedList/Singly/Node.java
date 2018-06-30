package algorithms.LinkedList.Singly;

public class Node<E> {
    Node<E> next;
    E data;


    //c
    public Node() {
        this.next = null;
        this.data = null;
    }


    public Node(E data) {
        this.data = data;
    }

    public Node(E data, Node<E> prevNode) {

        this(data);
        prevNode.next = this;
        this.next = prevNode.next;

    }


    //g&s
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
