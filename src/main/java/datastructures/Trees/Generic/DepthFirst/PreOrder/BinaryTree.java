package datastructures.Trees.Generic.DepthFirst.PreOrder;

// pre-order: a depth-first traversal
// sequence: root , get left , get right
// notes: this would be a recursive process.


public class BinaryTree<E> {

    Node<E> root;

    private void preOrder(Node<E> node) {
        if (node != null) {
            node.visit(node);
            preOrder(node.getLeft());
            preOrder(node.getRight());

        }

    }

    public void preOrder() {
        this.preOrder(root);
    }

}
