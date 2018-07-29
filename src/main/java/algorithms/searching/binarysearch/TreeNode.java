package algorithms.searching.binarysearch;

public class TreeNode<E> {

    private E value;
    private TreeNode<E> parent;
    private TreeNode<E> left;
    private TreeNode<E> right;


    public TreeNode(E val, TreeNode<E> par) {   // null gets passed for root element

        this.parent = par;
        this.value = val;
        this.left = null;
        this.right = null;
    }


    public TreeNode<E> addLeftChild(E val) {
        this.left = new TreeNode<>(val, this);
        return this.left;
    }

    public TreeNode<E> addRightChild(E val) {
        this.right = new TreeNode<>(val, this);
        return this.right;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public TreeNode<E> getParent() {
        return parent;
    }

    public void setParent(TreeNode<E> parent) {
        this.parent = parent;
    }

    public TreeNode<E> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<E> left) {
        this.left = left;
    }

    public TreeNode<E> getRight() {
        return right;
    }

    public void setRight(TreeNode<E> right) {
        this.right = right;
    }
}
