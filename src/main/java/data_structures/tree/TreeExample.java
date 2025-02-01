package data_structures.tree;

/**
 * A tree is a non-linear data structure used to store data in a hierarchical way.
 *
 * **Use Cases:**
 * - File explorer
 * - Databases
 * - HTML DOM
 * - DNS
 *
 * **Key Concepts & Terminology:**
 * - **Root**: The topmost node with no parent.
 * - **Leaf**: A node with no children.
 * - **Internal Node**: A node with at least one child.
 * - **Depth**: Number of edges from the root to a node.
 * - **Height**: Longest path from a node to a leaf.
 * - **Subtree**: A tree formed by a node and all its descendants.
 * - **Traversals**: In-Order, Post-Order, Pre-Order (DFS); Level-Order (BFS).
 *
 * Example Tree Structure (Binary Tree):
 *
 *         A
 *       /   \
 *      B     C
 *     / \   / \
 *    D   E F   G
 */
public class TreeExample {
    public static void main(String[] args) {
        // Constructing the tree
        Node root = new Node("A");
        root.left = new Node("B");  // A->B
        root.right = new Node("C"); // A->C
        root.left.left = new Node("D");  // B->D
        root.left.right = new Node("E"); // B->E
        root.right.left = new Node("F");  // C->F
        root.right.right = new Node("G"); // C->G

        // Traversals
        System.out.println("In-Order Traversal:");
        root.inOrderTraversal(root); // Output: D B E A F C G

        System.out.println("\n\nPost-Order Traversal:");
        root.postOrderTraversal(root); // Output: D E B F G C A

        System.out.println("\n\nPre-Order Traversal:");
        root.preOrderTraversal(root); // Output: A B D E C F G

        System.out.println("\n\nBreadth-First Search (BFS) Traversal:");
        root.bfsTraversal(root); // Output: A B C D E F G
    }
}
