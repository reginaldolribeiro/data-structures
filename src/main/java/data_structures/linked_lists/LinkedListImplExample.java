package data_structures.linked_lists;

import java.util.Stack;

/**
 * A demonstration of singly linked list operations.
 *
 * This example defines a basic linked list using a custom `ListNode` class and provides
 * methods to:
 * 1. Print the linked list in natural (forward) order.
 * 2. Print the linked list in reverse order using a stack.
 *
 * Key Features:
 * - Demonstrates traversal of a linked list.
 * - Uses a stack for reverse traversal since a singly linked list lacks backward links.
 */
public class LinkedListImplExample {
    public static void main(String[] args) {

        // Create a linked list: 1 -> 2 -> 3
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));

        // Print the linked list in natural order
        System.out.println("Printing in Natural Order...");
        printLinkedList(head);

        // Print the linked list in reverse order
        System.out.println("Printing in Reverse Order...");
        reversePrintLinkedList(head);
    }


    /**
     * Prints the elements of the linked list in natural order (head to tail).
     *
     * Algorithm:
     * 1. Start from the head node.
     * 2. Traverse the list using a while loop until the current node is null.
     * 3. Print the value of each node followed by " -> ".
     * 4. End with a newline after traversal.
     *
     * Big O Notation:
     * - Time Complexity: O(n) — Traverses all n nodes in the list.
     * - Space Complexity: O(1) — Uses no additional space apart from variables.
     *
     * @param head The head node of the linked list.
     */
    private static void printLinkedList(ListNode head) {
        if (head == null) {
            return; // Exit if the list is empty
        }

        ListNode current = head; // Start from the head node
        while (current != null) {
            System.out.print(current.val + " -> "); // Print the current node's value
            current = current.next; // Move to the next node
        }
        System.out.println(); // End with a newline
    }

    /**
     * Prints the elements of the linked list in reverse order using a stack.
     *
     * Algorithm:
     * 1. Traverse the list and push each node onto a stack (LIFO structure).
     * 2. Pop nodes from the stack and print their values to achieve reverse order.
     *
     * Big O Notation:
     * - Time Complexity: O(n) — Traverses all n nodes in the list and processes each in the stack.
     * - Space Complexity: O(n) — The stack requires space proportional to the number of nodes.
     *
     * @param head The head node of the linked list.
     */
    public static void reversePrintLinkedList(ListNode head) {
        Stack<ListNode> stack = new Stack<>(); // Create a stack to store nodes
        ListNode current = head; // Start from the head node

        // Push all nodes onto the stack
        while (current != null) {
            stack.add(current);
            current = current.next;
        }

        // Pop nodes from the stack and print their values
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().val + " -> ");
        }
    }

}
