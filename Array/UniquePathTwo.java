public class UniquePathTwo {
    // DP method to count paths avoiding obstacles
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) return 0;
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) return 0;

        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        // Initialize first column
        for (int i = 1; i < m; i++) {
            dp[i][0] = (obstacleGrid[i][0] == 0) ? dp[i - 1][0] : 0;
        }

        // Initialize first row
        for (int j = 1; j < n; j++) {
            dp[0][j] = (obstacleGrid[0][j] == 0) ? dp[0][j - 1] : 0;
        }

        // Fill in DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return dp[m - 1][n - 1];
    }

    // Entry point to test the logic
    public static void main(String[] args) {
        UniquePathTwo sol = new UniquePathTwo();

        int[][] obstacleGrid1 = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        System.out.println(sol.uniquePathsWithObstacles(obstacleGrid1)); // Expected: 2

        int[][] obstacleGrid2 = {
            {0, 1},
            {0, 0}
        };
        System.out.println(sol.uniquePathsWithObstacles(obstacleGrid2)); // Expected: 1
    }
}
