package data_structures.linked_lists;

import java.util.LinkedList;

/**
 * LinkedList in Java:
 * - Stores nodes in two parts: data and address (reference).
 * - Nodes are in non-consecutive memory locations.
 * - Elements are linked using pointers.
 *
 * Types of LinkedLists:
 * 1. Singly Linked List:
 *    - Node structure: [data | address] -> [data | address] -> [data | address]
 *    - Each node points to the next node in the list.
 * 2. Doubly Linked List:
 *    - Node structure: [address | data | address] <-> [address | data | address]
 *    - Each node has pointers to both the previous and next nodes.
 *
 * Advantages:
 *  1. Dynamic Data Structure: Allocates memory as needed during runtime.
 *  2. Easy insertion and deletion of nodes (O(1) if pointer/reference is known).
 *  3. Low memory waste as memory is allocated as required.
 *
 * Disadvantages:
 *  1. Greater memory usage (additional pointer)
 *  2. No random access of elements (no index [i])
 *  3. Accessing/Searching elements is more time-consuming. O(n)
 *
 * Uses:
 *  1. Implement Stacks/Queues
 *  2. GPS Navigation
 *  3. Music playlist
 *
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Using LinkedList as a Stack
//        linkedList.push("A"); // Add an element to the top of the list
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();

        // Using LinkedList as a Queue
        linkedList.offer("A"); // Add an element to the end of the list
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll(); // Remove the first element from the list

        System.out.println(linkedList);

        // Adding an element at a specific index
        linkedList.add(4, "E"); // Add "E" at index 4
        linkedList.remove("E"); // Remove "E" from the list
        System.out.println("Index of 'F': " + linkedList.indexOf("F"));

        // Peek operations (retrieve but do not remove)
        System.out.println("peekFirst: " + linkedList.peekFirst()); // Get the first element
        System.out.println("peekLast: " + linkedList.peekLast());   // Get the last element

        // Adding and removing elements from the start and end
        linkedList.addFirst("0"); // Add "0" at the beginning
        linkedList.addLast("G");  // Add "G" at the end
        linkedList.removeFirst(); // Remove the first element

        System.out.println("Final LinkedList: " + linkedList);
    }
}
