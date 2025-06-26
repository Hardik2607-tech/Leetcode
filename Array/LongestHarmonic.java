
import java.util.HashMap;
import java.util.Map;

public class LongestHarmonic {
    
    // Method to find longest harmonious subsequence
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int longest = 0;
        for (int num : freqMap.keySet()) {
            if (freqMap.containsKey(num + 1)) {
                int currentLength = freqMap.get(num) + freqMap.get(num + 1);
                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        int result = findLHS(nums);
        System.out.println("Longest Harmonious Subsequence length: " + result);
    }
}
