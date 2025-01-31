package data_structures.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates the usage of the `Map` interface in Java, with a focus on the `HashMap` implementation.
 *
 * Key Features of `Map`:
 * - A collection of **key-value pairs** where each key is **unique**.
 * - Provides fast access, insertion, and deletion:
 *   - Average time complexity for `HashMap`: **O(1)** (assuming no collisions).
 * - Order depends on the implementation:
 *   - **HashMap**: No specific order.
 *   - **LinkedHashMap**: Maintains insertion order.
 *   - **TreeMap**: Maintains elements sorted by keys.
 * - Only supports **Objects** (no primitive types).
 *
 * **When to Use?**
 * - When you need to create a relationship between keys and values, such as:
 *   - Mapping `userId` to `username`.
 *   - Storing counts of elements (e.g., word frequencies).
 */
public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap to store employee names and their IDs
        Map<String, Integer> empIds = new HashMap<>();

        // Adding key-value pairs to the map
        empIds.put("John", 101); // Add key "John" with value 101
        empIds.put("Mary", 102); // Add key "Mary" with value 102

        // Printing the entire map
        System.out.println(empIds); // Output: {John=101, Mary=102}

        // Retrieving a value by its key
        System.out.println(empIds.get("Mary")); // Output: 102

        // Checking for the presence of keys and values
        System.out.println(empIds.containsKey("Mary"));    // true: "Mary" exists as a key
        System.out.println(empIds.containsKey("Claudio")); // false: "Claudio" does not exist
        System.out.println(empIds.containsValue(101));     // true: 101 exists as a value
        System.out.println(empIds.containsValue(103));     // false: 103 does not exist

        // Updating the value associated with a key
        empIds.put("John", 103); // Replaces the value for "John" with 103
        System.out.println(empIds); // Output: {John=103, Mary=102}

        // Using the replace method to update a value
        empIds.replace("John", 101); // Updates value for "John" to 101
        System.out.println(empIds); // Output: {John=101, Mary=102}
        empIds.replace("Kramer", 777); // No effect, as "Kramer" does not exist
        System.out.println(empIds); // Output: {John=101, Mary=102}

        // Using putIfAbsent to add a value only if the key is not already present
        empIds.putIfAbsent("John", 222); // No effect, as "John" already exists
        System.out.println(empIds); // Output: {John=101, Mary=102}
        empIds.putIfAbsent("Steve", 222); // Adds "Steve" with value 222
        System.out.println(empIds); // Output: {John=101, Mary=102, Steve=222}

        // Removing a key-value pair
        empIds.remove("Steve"); // Removes "Steve" and its associated value
        System.out.println(empIds); // Output: {John=101, Mary=102}
    }
}