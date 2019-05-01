package cs.cscollections.binarytree;

import java.util.Iterator;

/**
 * The BinaryTreeADT provides an interface that
 * defines an API for a BinaryTree object.  The
 * interface is implementation agnostic.
 *
 * @author Scott Sigman
 * @version April 2019
 *
 * @param <T> The type of data the root node of the
 *           tree contains. The type T must implement
 *           the Comparable interface.
 */
public interface BinaryTreeADT<T> {
    /**
     * Reports the root of the tree.
     * @return The root value of the tree.
     */
    public T root();

    /**
     * Reports the number of non-null nodes
     * in the tree.
     *
     * @return The number of non-null nodes in the tree.
     */
    public int size();

    /**
     * Reports whether the tree contains nodes or not. If
     * the tree contains non-null nodes, isEmpty is true.
     * Otherwise, it returns false.
     *
     * @return True if the tree contains non-null nodes and
     * false otherwise.
     */
    public boolean isEmpty();

    /**
     * Returns the left subtree of the tree.
     *
     * @return The left subtree of the tree.
     */
    public BinaryTreeADT<T> left();

    /**
     * Returns the right subtree of the tree.
     *
     * @return The right subtree.
     */
    public BinaryTreeADT<T> right();

    /**
     * Returns an iterator that returns the nodes
     * in the order of a in-order traversal.
     *
     * @return Iterator that traverses the tree in-order.
     */
    public Iterator<T> iteratorInorder();
}
