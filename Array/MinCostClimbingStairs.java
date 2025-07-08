public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 0;
        dp[1] = 0;

        // Build up the dp table
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(
                dp[i - 1] + cost[i - 1],
                dp[i - 2] + cost[i - 2]
            );
        }

        return dp[n]; // Cost to reach the top
    }

    // Test cases
    public static void main(String[] args) {
        MinCostClimbingStairs solver = new MinCostClimbingStairs();

        int[] cost1 = {10, 15, 20};
        System.out.println("Output: " + solver.minCostClimbingStairs(cost1)); // Output: 15

        int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println("Output: " + solver.minCostClimbingStairs(cost2)); // Output: 6
    }
}
