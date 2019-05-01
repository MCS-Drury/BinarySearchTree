import cs.cscollections.binarytree.BinaryTree;

import java.util.Iterator;

/**
 * TreeTest builds the tree from the lab 12 assignment and uses
 * the iterator to print the nodes from an inorder traversal of the
 * tree.
 *
 * @author S. Sigman
 * @version 04/23/2019
 */
public class TreeTest {

    public static void main(String[] args) {
        // Create the leaves of the left subtree
        System.out.println("Creating the leaves for the left subtree-" +
                "Bob & Erin\n");
        BinaryTree<String> lleaf1 = new BinaryTree<>("Bob");
        BinaryTree<String> lleaf2 = new BinaryTree<>("Erin");

        // Create the subtree rooted at Don
        System.out.println("Creating the subtree rooted at Don");
        BinaryTree<String> lsubTree1 = new BinaryTree<>("Don",lleaf1, lleaf2);
        System.out.printf("Subtree rooted at Don has %d nodes.\n\n",lsubTree1.size() );

        // Create the subtree rooted at Phillis
        System.out.println("Creating the subtree rooted at Phillis");
        BinaryTree<String> lsubTree2 = new BinaryTree<>("Phillis",
                                                         lsubTree1,
                                                         new BinaryTree<String>());
        System.out.printf("Subtree rooted at Phillis has %d nodes.\n\n",lsubTree2.size());

        // Create the subtree rooted at April
        System.out.println("Creating the subtree rooted at April");
        BinaryTree<String> lsubTree3 = new BinaryTree<>("April",
                                                         new BinaryTree<String>(),
                                                         lsubTree2);
        System.out.printf("Subtree rooted at April has %d nodes.\n\n",lsubTree3.size() );

        // Create the subtree rooted at Adam
        System.out.println("Creating the subtree rooted at Adam");
        BinaryTree<String> lsubTree4 = new BinaryTree<>("Adam",
                                                        new BinaryTree<String>(),
                                                        lsubTree3);
        System.out.printf("Subtree rooted at Adam has %d nodes.\n\n",lsubTree4.size() );

        // Create the leaf of the right subtree
        System.out.println("Creating the leaves for the right subtree-" +
                "Tim\n");
        BinaryTree<String> rleaf1 = new BinaryTree<>("Tim");

        // Create the right subtree rooted at Tom
        System.out.println("Creating the subtree rooted at Tom");
        BinaryTree<String> rsubTree1 = new BinaryTree<>("Tom",
                                                        rleaf1,
                                                        new BinaryTree<String>());
        System.out.printf("Subtree rooted at Tom has %d nodes.\n\n",rsubTree1.size() );

        // Create the right subtree rooted at Sue
        System.out.println("Creating the subtree rooted at Sue");
        BinaryTree<String> rsubTree2 = new BinaryTree<>("Sue",
                                                         new BinaryTree<String>(),
                                                         rsubTree1);
        System.out.printf("Subtree rooted at Sue has %d nodes.\n\n",rsubTree2.size() );

        // Create the tree with root Sally
        System.out.println("Creating tree with root Sally");
        BinaryTree<String> tree = new BinaryTree<>("Sally",
                                                   lsubTree4,
                                                   rsubTree2);
        System.out.printf("The tree rooted at Sally has %d nodes.\n\n",tree.size() );


        //Print an inorder traversal of the tree
        Iterator<String> it = tree.iteratorInorder();

        while (it.hasNext()) {
            System.out.printf("%s", it.next());
            if (it.hasNext())
                System.out.print(", ");
        }
        System.out.println();

    }
}
