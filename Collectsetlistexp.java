import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int firstRepeatingElement = findFirstRepeatingElement(arr);

        if (firstRepeatingElement != -1) {
            System.out.println("First repeating element: " + firstRepeatingElement);
        } else {
            System.out.println("No repeating elements found.");
        }
    }

    public static int findFirstRepeatingElement(int[] arr) {
        // Create a HashSet to store elements we have seen
        HashSet<Integer> seenElements = new HashSet<>();

        // Traverse the array from left to right
        for (int num : arr) {
            // If the element is already in the set, it's the first repeating element
            if (seenElements.contains(num)) {
                return num;
            } else {
                // If it's not in the set, add it to the set
                seenElements.add(num);
            }
        }

        // If no repeating element is found, return -1
        return -1;
    }
}
