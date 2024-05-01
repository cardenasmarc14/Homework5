import java.util.ArrayList;
import java.util.HashSet;

public class DistinctArrayList {

    public static void main(String[] args) {
        // Creating an ArrayList with duplicate elements
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(4);

        // Call removeDuplicates method to obtain distinct elements
        ArrayList<Integer> distinctList = removeDuplicates(List);

        // Print original and distinct lists
        System.out.println("Original List: " + List);
        System.out.println("Distinct List: " + distinctList);
    }

    // Removing duplicates from an ArrayList
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        // Create a HashSet to store distinct elements
        HashSet<E> set = new HashSet<>(list);

        // New set of elements from the Hashset
        ArrayList<E> distinctList = new ArrayList<>(set);

        return distinctList;
    }
}