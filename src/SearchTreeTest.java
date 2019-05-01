import cs.cscollections.binarytree.BinarySearchTree;
import java.util.Iterator;

/**
 * <p>Program to test the functionality of the BinarySearchTree class.
 * The program creates the following BST</p>
 * <pre>
 *           k
 *          / \
 *         d   m
 *        /\  /\
 *       b e n  o
 *               \
 *                s
 * </pre>
 *
 * <p>The program performs the following:</p>
 * <ol>
 *     <li>Creates the tree using the BST method add.</li>
 *     <li>Traverses the tree prints the nodes using the inorder iterator.</li>
 *     <li>Searches the tree for a target in a leaf, n.</li>
 *     <li>Searches the tree for a target in a node with one child, o.</li>
 *     <li>Searches the tree for a target in a node with two children, m.</li>
 *     <li>Searches the tree for a target in the root, k.</li>
 *     <li>Searches the tree for a target, which is not in the tree, c.</li>
 * </ol>
 */
public class SearchTreeTest {

    public static void main(String [] args) {
        BinarySearchTree<Character> tree = new BinarySearchTree<>(new Character('k'));
        tree.add(new Character('d'));
        tree.add(new Character('e'));
        tree.add(new Character('m'));
        tree.add(new Character('b'));
        tree.add(new Character('n'));
        tree.add(new Character('o'));
        tree.add(new Character('s'));

        System.out.printf("The size of the tree is %s.\n", tree.size());

        System.out.println("The tree nodes in order are: ");
        Iterator<Character> it = tree.iteratorInorder();
        while (it.hasNext()) {
            System.out.printf("%s", it.next());
            if (it.hasNext()) {
                System.out.print(", ");
            }
        }

        // Test searching the tree
        System.out.println("\n\n*** Searches ***");

        // Look for a leaf
        System.out.println("\nSearch 1 - find leaf");
        Character search4 = tree.find(new Character('n'));
        if(search4 != null) {
            System.out.printf("Searching for leaf n, found %s.\n", search4);
        } else {
            System.out.printf("Searching for leaf n failed.\n");
        }

        // Look for internal node with one child
        System.out.println("\nSearch 2 - node with one child");
        search4 = tree.find(new Character('o'));
        if(search4 != null) {
            System.out.printf("Searching for node containing o, found %s.\n", search4);
        } else {
            System.out.printf("Searching for node with one child, o, failed.\n");
        }

        // Look for internal node with two children
        System.out.println("\nSearch 3 - node with two children");
        search4 = tree.find(new Character('m'));
        if(search4 != null) {
            System.out.printf("Searching for node containing m, found %s.\n", search4);
        } else {
            System.out.printf("Searching for node with two children, m, failed.\n");
        }

        // Look for the root
        System.out.println("\nSearch 4 - root of tree");
        search4 = tree.find(new Character('k'));
        if(search4 != null) {
            System.out.printf("Searching for tree root containing k, found %s.\n", search4);
        } else {
            System.out.printf("Searching tree for root k failed.\n");
        }

        // Look for a value not in the tree
        System.out.println("\nSearch 5 - non-existent node");
        search4 = tree.find(new Character('c'));
        if(search4 != null) {
            System.out.printf("Searching for a node containing c, found %s.\n", search4);
        } else {
            System.out.printf("Searching tree c failed.\n");
        }
    }

}
