package data_structures.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Demonstrates the differences between Arrays and ArrayLists in Java.
 *
 * Key Differences:
 * - Arrays:
 *   - Fixed size: Cannot grow or shrink once created.
 *   - Can hold both primitive types and objects.
 *   - Access elements using indexes.
 * - ArrayLists:
 *   - Resizable: Grows and shrinks dynamically.
 *   - Can only hold objects (no primitive types directly).
 *   - Provides additional utility methods like `add`, `remove`, and `set`.
 */
public class ArrayVsArrayList {

    public static void main(String[] args) {
        // Arrays: Fixed size and can hold primitives or objects
        String[] friendsArray = new String[4]; // Creates an array with 4 null elements
        String[] friendsArray2 = {"John", "Chris", "Eric", "Luke"}; // Predefined array with 4 elements

        // ArrayList: Dynamic size and can only hold objects
        ArrayList<String> friendsArrayList = new ArrayList<>(); // Empty ArrayList
        ArrayList<String> friendsArrayList2 =
                new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke")); // ArrayList initialized with values

        // Get element
        System.out.println("Array element at index 1: " + friendsArray2[1]); // Direct access using an index
        // System.out.println(friendsArrayList.get(1)); // Throws IndexOutOfBoundsException if the index doesn't exist

        // Get size
        System.out.println("Size of friendsArray: " + friendsArray2.length); // Fixed size of the array
        System.out.println("Size of friendsArrayList: " + friendsArrayList2.size()); // Dynamic size of the ArrayList

        // Add an element to ArrayList (not possible with arrays)
        friendsArrayList.add("Mitch"); // Adds a new element to the end of the ArrayList
        System.out.println("Added 'Mitch' to ArrayList: " + friendsArrayList);

        // Modify an element
        friendsArray2[0] = "Carl"; // Directly updates the value at index 0 in the array
        System.out.println("Updated Array element at index 0: " + friendsArray2[0]);

        friendsArrayList2.set(0, "Carl"); // Updates the value at index 0 in the ArrayList
        System.out.println("Updated ArrayList element at index 0: " + friendsArrayList2.get(0));

        // Remove an element from ArrayList (not possible with arrays)
        friendsArrayList2.remove("Chris"); // Removes the first occurrence of "Chris"
        System.out.println("ArrayList after removing 'Chris': " + friendsArrayList2);

        // Print arrays and ArrayLists
        System.out.println("Array (memory address): " + Arrays.toString(friendsArray2)); // Converts array to string for printing
        System.out.println("ArrayList: " + friendsArrayList2); // ArrayList has a built-in `toString` method
    }
}