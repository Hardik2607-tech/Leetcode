public class NumberOfIslands {

  // Method to count the number of islands
  public int numIslands(char[][] grid) {
      if (grid == null || grid.length == 0) return 0;

      int numIslands = 0;
      int rows = grid.length;
      int cols = grid[0].length;

      // Iterate through each cell in the grid
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              // If a land cell is found
              if (grid[i][j] == '1') {
                  numIslands++; // Increment island count
                  dfs(grid, i, j); // Mark all connected land cells
              }
          }
      }

      return numIslands;
  }

  // Helper method to perform DFS
  private void dfs(char[][] grid, int row, int col) {
      int rows = grid.length;
      int cols = grid[0].length;

      // Check for invalid indices and water cells
      if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == '0') {
          return;
      }

      grid[row][col] = '0'; // Mark the cell as visited

      // Explore all four directions
      dfs(grid, row - 1, col); // Up
      dfs(grid, row + 1, col); // Down
      dfs(grid, row, col - 1); // Left
      dfs(grid, row, col + 1); // Right
  }

  // Main method to test the solution
  public static void main(String[] args) {
      NumberOfIslands solution = new NumberOfIslands();

      // Example 1
      char[][] grid1 = {
          {'1','1','1','1','0'},
          {'1','1','0','1','0'},
          {'1','1','0','0','0'},
          {'0','0','0','0','0'}
      };
      System.out.println("Number of islands (Example 1): " + solution.numIslands(grid1)); // Output: 1

      // Example 2
      char[][] grid2 = {
          {'1','1','0','0','0'},
          {'1','1','0','0','0'},
          {'0','0','1','0','0'},
          {'0','0','0','1','1'}
      };
      System.out.println("Number of islands (Example 2): " + solution.numIslands(grid2)); // Output: 3
  }
}
