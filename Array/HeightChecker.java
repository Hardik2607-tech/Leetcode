import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone(); // Make a copy of the original array
        Arrays.sort(expected);           // Sort to get the expected order

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++; // Count mismatched positions
            }
        }

        return count;
    }

    // For testing
    public static void main(String[] args) {
        HeightChecker checker = new HeightChecker();
        System.out.println(checker.heightChecker(new int[]{1, 1, 4, 2, 1, 3})); // Output: 3
        System.out.println(checker.heightChecker(new int[]{5, 1, 2, 3, 4}));   // Output: 5
        System.out.println(checker.heightChecker(new int[]{1, 2, 3, 4, 5}));   // Output: 0
    }
}
