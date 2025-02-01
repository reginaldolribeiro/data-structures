package data_structures.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Represents a Node in a binary tree with left and right child references.
 * Includes methods for tree traversal using in-order, post-order, and pre-order strategies.
 */
public class Node {
    String data;
    Node left;
    Node right;

    public Node(String data){
        this.data = data;
    }

    /**
     * In-Order Traversal:
     * Traverses the tree in the order: left -> root -> right.
     * Commonly used to navigate a tree in sorted order (for BSTs).
     *
     * @param root The root node of the tree/subtree to traverse.
     */
    public void inOrderTraversal(Node root) {
        if (root == null) return; // Handle null root case
        if (root.left != null)
            inOrderTraversal(root.left); // Traverse left subtree
        System.out.print(root.data + " "); // Visit root
        if (root.right != null)
            inOrderTraversal(root.right); // Traverse right subtree
    }

    /**
     * Post-Order Traversal:
     * Traverses the tree in the order: left -> right -> root.
     * Commonly used to delete a tree from leaf to root.
     *
     * @param root The root node of the tree/subtree to traverse.
     */
    public void postOrderTraversal(Node root) {
        if (root == null) return; // Handle null root case
        if (root.left != null)
            postOrderTraversal(root.left); // Traverse left subtree
        if (root.right != null)
            postOrderTraversal(root.right); // Traverse right subtree
        System.out.print(root.data + " "); // Visit root
    }

    /**
     * Pre-Order Traversal:
     * Traverses the tree in the order: root -> left -> right.
     * Commonly used to create a copy of a tree or evaluate expressions.
     *
     * @param root The root node of the tree/subtree to traverse.
     */
    public void preOrderTraversal(Node root) {
        if (root == null) return; // Handle null root case
        System.out.print(root.data + " "); // Visit root
        if (root.left != null)
            preOrderTraversal(root.left); // Traverse left subtree
        if (root.right != null)
            preOrderTraversal(root.right); // Traverse right subtree
    }

    /**
     * Breadth-First Search (Level Order Traversal):
     * Traverses the tree level by level.
     * Uses a queue to explore nodes at the current depth before moving deeper.
     *
     * @param root The root node of the tree to traverse.
     */
    public void bfsTraversal(Node root){
        if(root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root); // Add root to the queue
//        queue.add(root);

        System.out.println("\nBFS Traversal:");

        while(!queue.isEmpty()){
            Node current = queue.poll(); // Remove and process the front of the queue
            System.out.print(current.data + " ");

            // Enqueue left and right children
            if(current.left != null)
                queue.offer(current.left);
            if(current.right != null)
                queue.offer(current.right);
        }

    }

}
