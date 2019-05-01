package cs.cscollections.binarytree;

import java.util.Iterator;

public class BinaryTree<T> implements BinaryTreeADT<T>{
    protected T root;               // root element of the tree
    protected int size;             // number of nodes in the tree
    protected BinaryTree<T> left;   // left subtree
    protected BinaryTree<T> right;  // right subtree

    /**
     * Constructor to create a tree with the two tree children specified.
     *
     * @param ele Root of the tree.
     * @param left Left subtree.
     * @param right Right subtree.
      */

    public BinaryTree(T ele, BinaryTree<T> left, BinaryTree<T> right) {
        root = ele;
        this.left = left;
        this.right = right;
        size = left.size() + right.size() + 1;
    }

    /**
     * Constructor to create an empty tree.
     */
    public BinaryTree() {
       root = null;
       left = null;
       right = null;
       size = 0;
    }

    /**
     * Constructor to create a leaf node.
     *
     */
    public BinaryTree(T ele) {
        this(ele,new BinaryTree<>(), new BinaryTree<>());
    }

    /**
     * Method to get the root of the tree.
     *
     * @return The root of the tree.
     */
    @Override
    public T root() {
        return root;
    }

    /**
     * Method to return the number of nodes in the tree.
     *
     * @return The number of nodes in the tree.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * isEmpty tests whether a tree has nodes or not.
     *
     * @return True if the tree has no root node, otherwise false.
     */
    @Override
    public boolean isEmpty() {
        return root==null;
    }

    /**
     * Method to return the left subtree of the current tree.
     * @return The left subtree of the tree.
     */
    @Override
    public BinaryTree left() {
        return left;
    }

    /**
     * Method to return the right subtree of the current tree.
     *
     * @return The right subtree of the tree.
     */
    @Override
    public BinaryTree right() {
        return right;
    }

    /**
     * iteratorInorder returns the nodes in the tree in the order
     * they are visited in an inorder traversal of the tree.
     *
     * @return An iterator which returns nodes in the tree inorder.
     */
    @Override
    public Iterator<T> iteratorInorder() {
        return new TreeIterator<>(this, this.size);
    }
}
