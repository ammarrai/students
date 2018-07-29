package datastructures.Trees.Generic.BreadthFirst.LevelOrder;

public class Node<E> {

    private E value;
    private Node<E> parent;
    private Node<E> left;
    private Node<E> right;

    //takes in value + parent
    public Node(E val, Node<E> par) {   // null gets passed for root element
        this.value = val;
        this.parent = par;
        this.left = null;
        this.right = null;
    }

    public Node<E> addLeftChild(E val) {
        this.left = new Node<E>(val, this);
        return this.left;
    }

    public Node<E> addRightChild(E val) {
        this.right = new Node<E>(val, this);
        return this.right;
    }

    public void visit() {

        // do something;
    }


    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getParent() {
        return parent;
    }

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }
}
