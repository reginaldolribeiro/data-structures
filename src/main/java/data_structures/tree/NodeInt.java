package data_structures.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Represents a node in a binary tree.
 * Each node contains an integer value (`data`), and references to its left and right child nodes.
 */
public class NodeInt {
    int data;
    NodeInt left;
    NodeInt right;

    public NodeInt(int data){
        this.data = data;
    }

    /**
     * In-Order Traversal:
     *  left -> root -> right
     *
     * Used to navigate in a Tree in order
     */
    public void traverseTree(NodeInt root){
        if(root.left != null)
            traverseTree(root.left);
        System.out.print(root.data + " ");
        if(root.right != null)
            traverseTree(root.right);
    }

    /**
     * In-Order Traversal:
     *  left -> right -> root
     *
     *  Used to delete a Tree from Leaf to Root
     */
    public void postOrderTraverseTree(NodeInt root){
        if(root.left != null)
            postOrderTraverseTree(root.left);
        if(root.right != null)
            postOrderTraverseTree(root.right);
        System.out.print(root.data + " ");
    }

    /**
     * Pre-Order Traversal:
     *  root -> left -> right
     *
     * Used to create a copy of a tree
     *
     */
    public void preOrderTraverseTree(NodeInt root){
        System.out.print(root.data + " ");
        if(root.left != null) {
            preOrderTraverseTree(root.left);
        }
        if(root.right != null) {
            preOrderTraverseTree(root.right);
        }
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
