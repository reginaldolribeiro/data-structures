package data_structures.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Demonstrates the usage of a Queue in Java.
 * A Queue follows the FIFO (First-In-First-Out) principle, where elements are added at the end and removed from the front.
 * Common operations include:
 * - Enqueue: Adding elements to the queue.
 * - Dequeue: Removing elements from the queue.
 * - Peek: Retrieving the head of the queue without removing it.
 *
 * Use cases for queues include:
 *  1. Keyboard Buffer: Ensuring keystrokes appear on the screen in the order they're pressed.
 *  2. Printer Queue: Managing print jobs in the order they are received.
 *  3. Implementations in data structures like LinkedLists, PriorityQueues, and algorithms like Breadth-First Search.
 */
public class QueueExample {
    public static void main(String[] args) {
        // Initialize a Queue using LinkedList
        Queue<String> queue = new LinkedList<String>();

        // Check if the queue is empty
        System.out.println("The queue is empty? " + queue.isEmpty());
        System.out.println("The queue " + queue);

        // Adding people in line
        System.out.println("Adding people in line...\n");
//        queue.add("Test1"); add and queue has the same function
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println("Now we have " + queue.size() + " people in the line: \n" + queue);
        System.out.println("The queue is empty? " + queue.isEmpty());

        System.out.println("Is Harold in line? " + queue.contains("Harold"));

        // Removing people from the line
        System.out.println("\nPeople in the queue: " + queue);
        System.out.println("\nRemoving people from the line ...");
//        System.out.println(queue.peek());
        queue.poll(); //dequeue
        queue.poll(); //dequeue

        System.out.println("\nFinal queue: " + queue);

        // Iterating and removing elements one by one to demonstrate the FIFO behavior of a queue.
        // Note: This can be replaced with queue.clear() for simplicity in real-world use cases.
        System.out.println("\nIterating...");
        while (!queue.isEmpty()) {
            System.out.println("Removing: " + queue.poll());
        }
        // OR - Clear the queue
        queue.clear();
        System.out.println("\nThe queue is empty? " + queue.isEmpty());
    }
}
