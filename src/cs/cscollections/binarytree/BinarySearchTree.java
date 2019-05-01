package cs.cscollections.binarytree;

/**
 * <p>Provides a linked implementation of a binary search tree (BST).
 * Nodes are ordered in the tree according to the two following rules.</p>
 *
 * <ol>
 *     <li>All nodes in the left subtree contain an item whose value
 *     is less than the value of item in the root node.</li>
 *     <li>All nodes in right subtree contain an item whose value
 *     is greater than or equal to the value of the item in the
 *     root node.</li>
 *  </ol>
 *
 *
 *
 * @param <T> The type of data the root node of the
 *           tree contains. The type T must implement
 *           the Comparable interface.
 */
public class BinarySearchTree<T> extends BinaryTree<T>
                                 implements BinarySearchTreeADT<T> {

    /*public BinarySearchTree(T ele, BinarySearchTree<T> left, BinarySearchTree<T> right) {
        super(ele, left, right);
    }*/

    /**
     * Constructor to create a BST with a single node,
     * the root.  Subtrees created by this constructor
     * are leaves.
     *
     * @param ele The element to add to the tree.
     */
    public BinarySearchTree(T ele) {
        super(ele);
    }

    /**
     * Constructor to create an empty BST.  This
     * constructor constructs a null tree.
     */
    public BinarySearchTree() {
        super();
    }

    /**
     * Searches a BST or the node specified by the value of
     * target.  Returns a reference to the item in the tree or
     * null if the item is not found.
     *
     * @param target The item to search for in the tree.
     * @return A reference to the item in the tree or null
     * if the item is not found.
     */
    @Override
    public T find(T target) {
        return find(this,target);
    }

    /**
     * Inserts the specified item into the tree, maintaining the
     * tree as a BST.
     *
     * @param ele The element to add to the tree.
     */
    @Override
    public void add(T ele) {
        add(this, ele);
    }

    //**********************************************************
    // Utility method to recursively add an ele to the tree. The
    // element is copied into the appropriate null leaf.  The
    // node is converted to a leaf by adding null trees as it's
    // left and right trees.
    //**********************************************************
    private void add(BinaryTree<T> tree, T ele) {
        if (tree.root == null) {
            // copy the root in
            tree.root = ele;
            // set the right and left trees to null trees
            tree.left = new BinaryTree<>();
            tree.right = new BinaryTree<>();
            tree.size = 1;
            return;
        } else if (((Comparable<T>) ele).compareTo(tree.root) < 0) {
            add(tree.left, ele);
        } else {
            add(tree.right, ele);
        }
        tree.size = tree.left.size + tree.right.size + 1;
    }

    //**********************************************************
    // Utility method to recursively find an ele, target, in the
    // tree. If the target is found the method returns a
    // reference to the element. Otherwise it returns a null
    // reference.
    //**********************************************************
    private T find(BinaryTree<T> tree, T target) {
        if (tree.root == null || ((Comparable<T>) tree.root).compareTo(target) == 0) {
            // found the node or where it should be
            return tree.root;
        }
        else if (((Comparable<T>) target).compareTo(tree.root) < 0) {
            return find(tree.left, target);
        } else {
            return find(tree.right, target);
        }
    }
}

