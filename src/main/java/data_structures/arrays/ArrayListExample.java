package data_structures.arrays;

import java.util.ArrayList;

/**
 * Demonstrates the usage of ArrayList in Java.
 *
 * ArrayList:
 * - A resizable array that can grow or shrink dynamically.
 * - Stores reference data types (objects).
 * - Allows random access and modification of elements.
 *
 * Big O Notation for Main Operations:
 * - Add (at the end): O(1) on average (amortized), O(n) in the worst case due to resizing.
 * - Add (at an index): O(n) — Shifting elements is required.
 * - Get: O(1) — Direct access using the index.
 * - Set: O(1) — Direct access using the index.
 * - Remove (at an index): O(n) — Shifting elements is required.
 * - Size: O(1) — Returns the size of the list.
 * - Clear: O(1) — Clears the internal structure.
 */
public class ArrayListExample {

    public static void main(String[] args) {
        // Initialize the ArrayList to store food items
        ArrayList<String> food = new ArrayList<>();

        // Add elements to the ArrayList
        food.add("pizza");     // O(1) on average
        food.add("hamburger"); // O(1)
        food.add("hotdog");    // O(1)

        // Modify an element in the ArrayList
        food.set(0, "sushi");  // O(1)

        // Remove an element from the ArrayList
        food.remove(2);        // O(n)

        // Clear the ArrayList
        food.clear();          // O(1)

        // Print the elements in the ArrayList
        for (int i = 0; i < food.size(); i++) { // O(n) for iteration
            System.out.println(food.get(i));   // O(1) for each `get`
        }
    }
}