package data_structures.tree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {

        // Binary Search Tree = A tree data structure, where each node is greater than it's left child,
        //                      but less than it's right.
        //
        //                      benefit: easy to locate a node when they are in this order
        //
        //                      time complexity: best case 0(10g n)
        //                                       worst case O(n)
        //
        //                      space complexity: O(n)

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new NodeInt(5));
        tree.insert(new NodeInt(1));
        tree.insert(new NodeInt(9));
        tree.insert(new NodeInt(2));
        tree.insert(new NodeInt(7));
        tree.insert(new NodeInt(6));
        tree.insert(new NodeInt(4));
        tree.insert(new NodeInt(8));

        tree.display();
        System.out.println("\nDisplay Reverse ...");
        tree.displayReverse();

        System.out.println("\nTree search: " + tree.search(90));

        tree.remove(9);
        System.out.println("\nAfter removing...");
        tree.display();

        System.out.println("\nBFS Traversal...");
        tree.bfsTraversal(tree.root); // Output: 5 1 9 2 4 7 6 8

        /**
         *         5
         *       /   \
         *      1     9
         *       \   /
         *        2 7
         *         \  \
         *          4  8
         *             /
         *            6
         */
    }
}
