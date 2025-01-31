package data_structures.set;

import java.util.*;

/**
 * Demonstrates the usage of the `Set` interface in Java.
 *
 * Key Features of `Set`:
 * - A collection that stores **unique elements** (no duplicates allowed).
 * - Provides efficient methods for **insertion**, **deletion**, and **lookup**.
 * - The most common implementation of `Set` is **HashSet**.
 *
 * Common Implementations:
 * 1. **HashSet**:
 *    - Backed by a hash table.
 *    - Provides **O(1)** average time for add, remove, and contains operations.
 *    - Does **not maintain order** of elements.
 *
 * 2. **TreeSet**:
 *    - Backed by a Red-Black tree.
 *    - Maintains elements in **sorted order** or as defined by a custom comparator.
 *    - Provides **O(log n)** time complexity for add, remove, and contains operations.
 *
 * 3. **LinkedHashSet**:
 *    - Backed by a hash table and a linked list.
 *    - Maintains the **insertion order** of elements.
 *    - Provides **O(1)** average time for basic operations like add, remove, and contains.
 *
 * Big O Notation for Common Operations:
 * - Add:
 *   - HashSet: O(1)
 *   - TreeSet: O(log n)
 *   - LinkedHashSet: O(1)
 * - Remove:
 *   - HashSet: O(1)
 *   - TreeSet: O(log n)
 *   - LinkedHashSet: O(1)
 * - Contains:
 *   - HashSet: O(1)
 *   - TreeSet: O(log n)
 *   - LinkedHashSet: O(1)
 * - Iteration:
 *   - All implementations: O(n)
 *
 * Notes:
 * - Use **HashSet** for fast lookups and operations where order doesn’t matter.
 * - Use **TreeSet** when sorting is required.
 * - Use **LinkedHashSet** when the insertion order of elements must be preserved.
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Mary");
        System.out.println(names);
        System.out.println(names.contains("Mary")); // true
        System.out.println(names.contains("Claudio")); // false

        names.add("Mary"); // nothing happens because it's a set, which doesn't allow duplicates
        System.out.println(names); // [Mary, John]

        System.out.println(names.isEmpty()); // false

        System.out.println("\nFor loop ...");
        for(String name : names) {
            System.out.println("-> " + name);
        }
// OR
//        names.forEach(System.out::println);
// OR
        Iterator<String> namesIterator = names.iterator();
        while(namesIterator.hasNext()) {
            System.out.println("-> " + namesIterator.next());
        }
        System.out.println("End loop ...\n");


        names.remove("Mary");
        System.out.println(names); // [John]

        names.clear(); // removes all elements
        System.out.println(names); // empty set
        System.out.println(names.isEmpty()); // true

        System.out.println("\nConverting List to Set ...");
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(3);
        System.out.println(numberList); // [1, 2, 3, 3]

        Set<Integer> numberSet = new HashSet<>(numberList); // OR numbeSet.addAll(numberList);
        System.out.println(numberSet); // [1, 2, 3]

        // TreeSet keeps the natural order
        System.out.println("\nTreeSet ...");
        Set<String> namesTreeSet = new TreeSet<>();
        namesTreeSet.add("John");
        namesTreeSet.add("Mary");
        namesTreeSet.add("Alice");
        System.out.println(namesTreeSet); // [John, Mary]

        // LinkedHashSet keeps the insertion order
        System.out.println("\nLinkedHashSet ...");
        Set<String> namesLinkedHashSet = new LinkedHashSet<>();
        namesLinkedHashSet.add("John");
        namesLinkedHashSet.add("Mary");
        namesLinkedHashSet.add("Alice");
        System.out.println(namesLinkedHashSet); // [John, Mary, Alice]
    }
}
