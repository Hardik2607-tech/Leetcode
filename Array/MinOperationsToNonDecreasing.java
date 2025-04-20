import java.util.*;

public class MinOperationsToNonDecreasing {
    public static int minOperations(List<Integer> nums) {
        int operations = 0;

        while (!isNonDecreasing(nums)) {
            int minSum = Integer.MAX_VALUE;
            int indexToMerge = -1;

            // Find the pair with the minimum sum
            for (int i = 0; i < nums.size() - 1; i++) {
                int sum = nums.get(i) + nums.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    indexToMerge = i;
                }
            }

            // Merge the pair
            nums.set(indexToMerge, nums.get(indexToMerge) + nums.get(indexToMerge + 1));
            nums.remove(indexToMerge + 1);
            operations++;
        }

        return operations;
    }

    private static boolean isNonDecreasing(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    // Example usage
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(5, 2, 3, 1));
        System.out.println("Operations needed: " + minOperations(nums1)); // Output: 2

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 2, 2));
        System.out.println("Operations needed: " + minOperations(nums2)); // Output: 0
    }
}
