package data_structures.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Represents a Binary Search Tree (BST), where each node satisfies:
 * - All values in the left subtree are less than the node.
 * - All values in the right subtree are greater than the node.
 *
 * Provides methods for insertion, searching, traversal, and deletion of nodes.
 *
 * **Time Complexity:**
 * - Best Case: O(log n) for balanced trees.
 * - Worst Case: O(n) for skewed trees.
 *
 * **Space Complexity:**
 * - O(n) for storing nodes.
 */
public class BinarySearchTree {
    NodeInt root;

    public void insert(NodeInt node){
        root = insertHelper(root, node);
    }
    private NodeInt insertHelper(NodeInt root, NodeInt node){
        int data = node.data;
        if(root == null){
            root = node;
            return root;
        } else if(data < root.data){
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display(){
        displayHelper(root);
    }
    private void displayHelper(NodeInt root){
        if(root != null){
            displayHelper(root.left);
            System.out.print(root.data + " ");
            displayHelper(root.right);
        }
    }

    public void displayReverse(){
        displayReverseHelper(root);
    }
    private void displayReverseHelper(NodeInt root){
        if(root != null){
            displayReverseHelper(root.right);
            System.out.print(root.data + " ");
            displayReverseHelper(root.left);
        }
    }

    public boolean search(int data){
        return searchHelper(root, data);
    }
    private boolean searchHelper(NodeInt root, int data){
        if(root == null) {
            return false;
        } else if(root.data == data){
            return true;
        } else if(root.data > data){
            return searchHelper(root.left, data);
        } else{
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data){
        if(search(data)){
            removeHelper(root, data);
        } else {
            System.out.println(data + " could not be found!");
        }
    }
    private NodeInt removeHelper(NodeInt root, int data){
        if(root == null) {
            return root;
        } else if(data < root.data){
            root.left = removeHelper(root.left, data);
        } else if(data > root.data){
            root.right = removeHelper(root.right, data);
        } else { // node found
            if(root.left == null && root.right == null){ // leaf node
                root = null;
            } else if(root.right != null) { // find a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            } else { // find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(NodeInt root){ // find the least value below the right child of this root node
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(NodeInt root){
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.data;
    }

    public void bfsTraversal(NodeInt root) {
        if (root == null) return;

        Queue<NodeInt> queue = new LinkedList<>();
        queue.offer(root);

        System.out.println("\nBFS Traversal:");

        while (!queue.isEmpty()) {
            NodeInt current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
    }
}
