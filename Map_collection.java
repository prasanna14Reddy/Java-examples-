import java.util.HashMap;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        String input = "aabb";
        int index = findFirstNonRepeatedCharacterIndex(input);

        System.out.println("Index of the first non-repeated character: " + index);
    }

    public static int findFirstNonRepeatedCharacterIndex(String str) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Traverse the string and count each character's frequency
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Traverse the string again to find the first non-repeated character
        for (int i = 0; i < str.length(); i++) {
            if (charCountMap.get(str.charAt(i)) == 1) {
                return i; // Return the index of the first non-repeated character
            }
        }

        // If no non-repeated character is found, return -1
        return -1;
    }
}
