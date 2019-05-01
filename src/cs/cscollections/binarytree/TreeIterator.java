package cs.cscollections.binarytree;

import java.util.Iterator;

/**
 * This class provides an iterator for the BinaryTree class
 * that returns the nodes from an inorder traversal of the
 * tree.
 *
 * @param <T> Type of data stored in tree.
 */
public class TreeIterator<T> implements Iterator<T> {

    // current iterator
    private int current;
    // collection size
    private int count;
    // Linear collection of nodes
    private T[] collectionArray;

    // Constructs a TreeIterator that iterates over the tree
    public TreeIterator(BinaryTree<T> collection, int size) {
        // set the initial iterator state
        current = 0;
        count = size;
       // this.collection = collection;
        // make the collection
        collectionArray = (T []) new Object[count];
        // load the collectionArray
        inOrderTrav(collection);
        // reset current
        current = 0;
    } //end constructor

    /**
     * Method to check if more elements remain in the iteration
     *
     * @return True if elements remain in the iteration, otherwise false.
     */
    public boolean hasNext() {
        return current < count;
    } // end hasNext


    /**
     * Method to return the current element in the iteration and
     * advance the current element cursor to the next element.
     *
     * @return The current element of the iteration.
     */
    public T next() {
        T retVal = collectionArray[current];
        current++;
        return retVal;
    } // end next

    /**
     * Not implemented but must be included.
     *
     */
    public void remove() {
    } // end remove

    // Private method to traverse the tree inorder, storing the
    // nodes visited in the collectionArray.
    private void inOrderTrav(BinaryTree<T> tree) {
        if (tree.size() == 0)
            return;
        else {
               inOrderTrav(tree.left());
               // visit the root
               collectionArray[current] = tree.root();
               current++;
               inOrderTrav(tree.right());

        }
    } // end inOrderTrav
} // end TreeIterator
