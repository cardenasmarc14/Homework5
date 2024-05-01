import java.util.LinkedList;
import java.util.Iterator;

public class LinkTraversalTest {

    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        // Adding the 5000000 integers
        for (int i = 0; i < 5000000; i++) {
            linkedList.add(i);
        }

        // Measure time to traverse using iterator
        long startTimeIterator = System.nanoTime(); // Record start time
        traverseWithIterator(linkedList); // Traverse using iterator
        long endTimeIterator = System.nanoTime(); // Record end time
        long durationIterator = endTimeIterator - startTimeIterator; // Calculate duration
        System.out.println("Time taken using Iterator: " + durationIterator + " nanoseconds");

        // Measure time to traverse using get(index) method
        long startTimeGet = System.nanoTime(); // Record start time
        traverseWithGet(linkedList); // Traverse using get(index) method
        long endTimeGet = System.nanoTime(); // Record end time
        long durationGet = endTimeGet - startTimeGet; // Calculate duration
        System.out.println("Time taken using get(index): " + durationGet + " nanoseconds");
    }

    // Traverse linked list using iterator
    private static void traverseWithIterator(LinkedList<Integer> list) {
        Iterator<Integer> iterator = list.iterator(); // Get iterator
        while (iterator.hasNext()) { // Iterate through elements
            iterator.next(); // Move to next element
        }
    }

    // Traverse linked list using get(index) method
    private static void traverseWithGet(LinkedList<Integer> list) {
        int size = list.size(); // Get size of the list
        for (int i = 0; i < size; i++) { // Iterate through indexes
            list.get(i); // Get element at index
        }
    }
}