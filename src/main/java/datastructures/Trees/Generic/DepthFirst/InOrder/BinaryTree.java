package datastructures.Trees.Generic.DepthFirst.InOrder;

// In-order: a depth-first traversal
// sequence: get left-most, root of that, get-right
// notes: this would be a recursive process.


public class BinaryTree<E> {

    Node<E> root;

    private void InOrder(Node<E> node) {
        if (node != null) {
            InOrder(node.getLeft());
            node.visit(node);
            InOrder(node.getRight());

        }

    }

    public void InOrder() {
        this.InOrder(root);
    }

}
