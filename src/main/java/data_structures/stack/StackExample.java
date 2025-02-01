package data_structures.stack;

import java.util.Stack;

/**
 * Demonstrates the usage of the `Stack` class in Java.
 *
 * Key Features of `Stack`:
 * - LIFO (Last-In First-Out) data structure.
 * - Operations:
 *   - `push()`: Adds an object to the top of the stack.
 *   - `pop()`: Removes and returns the object at the top of the stack.
 *   - `peek()`: Returns the object at the top without removing it.
 *   - `empty()`: Checks if the stack is empty.
 *   - `search()`: Returns the position of an object in the stack.
 *
 * Common Use Cases:
 * 1. Undo/Redo features in text editors.
 * 2. Backtracking algorithms (e.g., solving mazes, navigating file directories).
 * 3. Managing browser history (back/forward navigation).
 * 4. Function call management using a call stack.
 *
 * Big O Notation:
 * - Push: O(1)
 * - Pop: O(1)
 * - Peek: O(1)
 * - Search: O(n)
 */
public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Demonstrating initial state of the stack
        System.out.println("Initial Stack: " + stack);
        System.out.println("Is empty? " + stack.empty());

        // Populating the stack
        System.out.println("\nAdding elements to the stack...");
        for (int i = 1; i <= 7; i++) {
            stack.push("Test" + i);
        }

        // Displaying populated stack
        System.out.println("Populated Stack: " + stack);
        System.out.println("Is empty? " + stack.empty());
        System.out.println("First element: " + stack.firstElement());
        System.out.println("Last element: " + stack.lastElement());

        // Demonstrating stack operations
        stack.pop(); // Removes the top element
        System.out.println("\nAfter pop operation: " + stack);
        System.out.println("Peek (top element): " + stack.peek());

        // Iterating and printing the stack
        System.out.println("\nIterating and clearing the stack:");
        printStackReadOnly(stack);
    }

    /**
     * Clears the stack by popping each element and prints them.
     *
     * @param stack The stack to be printed and cleared.
     */
    private static void clearAndPrintStack(Stack<String> stack) {
        if (stack == null || stack.isEmpty()) {
            System.out.println("The stack is empty.");
            return;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\nStack is now empty.");
    }

    /**
     * Prints the stack without modifying it.
     * Note: This method achieves the same result as directly printing the stack object
     * using System.out.println(stack).
     *
     * @param stack The stack to be printed.
     */
    private static void printStackReadOnly(Stack<String> stack) {
        if (stack == null || stack.isEmpty()) {
            System.out.println("The stack is empty.");
            return;
        }
        for (String element : stack) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}