public class ArrayMax {

    // Method to find the maximum element
    public static <E extends Comparable<E>> E max(E[] list) {
        // Initialize max element with the first array
        E maximum = list[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < list.length; i++) {
            // Compare each element with the current maximum element
            if (list[i].compareTo(maximum) > 0) {
                maximum = list[i];
            }
        }

        // Return the max element
        return maximum;
    }

    public static void main(String args[]) {

        Integer[] a1 = { 19, 22, 10 };
        //Displaying the result
        System.out.println("The maximum element in the array: " + max(a1));
    }
}