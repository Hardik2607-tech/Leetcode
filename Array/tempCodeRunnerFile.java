public class MinimumPathSum {
  public int minPathSum(int[][] grid) {
      int rows = grid.length;
      int cols = grid[0].length;

      // Initialize the first row
      for (int i = 1; i < cols; i++) {
          grid[0][i] += grid[0][i - 1];
      }

      // Initialize the first column
      for (int i = 1; i < rows; i++) {
          grid[i][0] += grid[i - 1][0];
      }

      // Compute the minimum path sum for the rest of the grid
      for (int i = 1; i < rows; i++) {
          for (int j = 1; j < cols; j++) {
              grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
          }
      }

      // The bottom-right cell contains the minimum path sum
      return grid[rows - 1][cols - 1];
  }
}
