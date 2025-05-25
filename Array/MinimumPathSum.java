public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Initialize the first row.
        for (int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i - 1];
        }

        // Initialize the first column.
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        // Compute the minimum path sum for the rest of the grid.
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }

        // The bottom-right cell contains the minimum path sum.
        return grid[m - 1][n - 1];
    }

    public static void main(String[] args) {
        MinimumPathSum solver = new MinimumPathSum();

        int[][] grid1 = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };
        System.out.println("Minimum Path Sum (Example 1): " + solver.minPathSum(grid1));

        int[][] grid2 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Minimum Path Sum (Example 2): " + solver.minPathSum(grid2));
    }
}
