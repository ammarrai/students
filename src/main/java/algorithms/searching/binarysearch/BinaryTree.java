package algorithms.searching.binarysearch;

public class BinaryTree<E extends Comparable<? super E>> {

  /*
    public boolean contains(E toFind) {


        Node<E> curr = root;
        int comp;
        while (curr != null) {

            comp = toFind.compareTo(curr.getValue());
            if (comp < 0)
                curr = curr.getLeft();

            else if (comp > 0)
                curr = curr.getRight();
            else
                return true;
        }
        return false;
    }


    public boolean insert(E toInsert) {
        Node<E> curr = root;
        int comp = toInsert.compareTo(curr.getValue());

        while (comp < 0 && curr.getLeft() != null ||
                comp > 0 && curr.getRight() != null)

        {
            if (comp < 0) curr = curr.getLeft();
            else curr = curr.getRight();
            comp = toInsert.compareTo(curr.getValue());
        }

        if (comp < 0) {
            curr.setLeft(toInsert, curr);
        } else if (comp > 0) {
            curr.setRight(toInsert, curr);
        } else return false;
        return true;

    }

*/
}

