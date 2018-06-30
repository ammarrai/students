package algorithms.LinkedList.Singly;

public class MyLinkedList<E> {

    //iv
    Node<E> head;
    int size;


    //c
    public MyLinkedList() {
        Node<E> head = new Node<>();
    }


    //g&s
    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
