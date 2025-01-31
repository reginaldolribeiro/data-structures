package data_structures.arrays;

/**
 * An array is a collection of items of the same variable type that are stored at contiguous memory locations.
 * It’s one of the most popular and simple data structures and is often used to implement other structures.
 * Each item in an array is indexed starting with 0.
 * Each element in an array is accessed through its index. This allows for efficient retrieval and modification of elements.
 * Elements are stored sequentially in memory, which allows for efficient traversal and processing of elements.
 *
 */
public class ArrayExample {
    public static void main(String[] args) {
        // Array is used to store multiple values in a single variable
        String[] cars = {"car1", "car2", "car3"};
//        String[] cars = {"car1", "car2", "car3", 123}; // error - type mismatch

        cars[0] = "car1-changed";
        System.out.println("cars[0]: " + cars[0]); // accessing by index

        System.out.println("\nIterating ... ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + i + " : " + cars[i]);
        }


        String[] colors = new String[2]; // defining the size
        colors[0] = "yellow";
        colors[0] = "red";
//        colors[0] = "black"; // error

    }
}
