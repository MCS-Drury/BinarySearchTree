package cs.cscollections.binarytree;

/**
 * <p>The BinarySearchTreeADT provides an API for binary search
 * tree (BST) implementations.  Binary search trees are defined by
 * the following rules: </p>
 *  <ol>
 *     <li>All nodes in the left subtree contain an item whose value
 *     is less than the value of item in the root node.</li>
 *     <li>All nodes in right subtree contain an item whose value
 *     is greater than or equal to the value of the item in the
 *     root node.</li>
 *  </ol>
 *
 * @author Scott Sigman
 * @version April 2019
 * @param <T> The type of the item stored in a node. The type
 *            T must implement the Comparable interface.
 */
public interface BinarySearchTreeADT<T> extends BinaryTreeADT<T> {

    /**
     * Searches a BST or the node specified by the value of
     * target.  Returns a reference to the item in the tree or
     * null if the item is not found.
     *
     * @param target The item to search for in the tree.
     *
     * @return A reference to the item in the tree or null
     *         if the item is not found.
     */
    public T find(T target);

    /**
     * Inserts the specified item into the tree, maintaining the
     * tree as a BST.
     *
     * @param ele The element to add to the tree.
     */
    public void add(T ele);
}
