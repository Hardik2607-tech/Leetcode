public class CombinationSumFour {
    public int combinationSum4(int[] nums, int target) {
        // dp[i] will store the number of combinations to reach the sum i
        int[] dp = new int[target + 1];
        dp[0] = 1; // Base case: There's one way to make the sum 0

        // Iterate through all sums from 1 to target
        for (int i = 1; i <= target; i++) {
            // For each number in nums
            for (int num : nums) {
                if (i >= num) {
                    // Add the combinations count of the (current sum - num)
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        CombinationSumFour solution = new CombinationSumFour();

        // Example 1
        int[] nums1 = {1, 2, 3};
        int target1 = 4;
        int result1 = solution.combinationSum4(nums1, target1);
        System.out.println("Example 1 Output: " + result1); // Expected Output: 7

        // Example 2
        int[] nums2 = {9};
        int target2 = 3;
        int result2 = solution.combinationSum4(nums2, target2);
        System.out.println("Example 2 Output: " + result2); // Expected Output: 0
    }
}
