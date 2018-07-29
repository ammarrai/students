package datastructures.Trees.Generic.DepthFirst.PostOrder;

// post-order: a depth-first traversal
// sequence: get left , get right, get root.
// notes: this would be a recursive process.


public class BinaryTree<E> {

    Node<E> root;

    private void postOrder(Node<E> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            node.visit(node);

        }

    }


    public void postOrder() {
        this.postOrder(root);
    }


}
