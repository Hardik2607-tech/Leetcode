public class MatrixSearch {
  public static boolean searchMatrix(int[][] matrix, int target) {
      int rows = matrix.length;
      if (rows == 0) return false;
      int cols = matrix[0].length;

      int row = 0, col = cols - 1;

      while (row < rows && col >= 0) {
          int current = matrix[row][col];
          if (current == target) {
              return true;
          } else if (current > target) {
              col--; // Move left
          } else {
              row++; // Move down
          }
      }

      return false;
  }

  public static void main(String[] args) {
      int[][] matrix = {
          {1, 4, 7, 11, 15},
          {2, 5, 8, 12, 19},
          {3, 6, 9, 16, 22},
          {10, 13, 14, 17, 24},
          {18, 21, 23, 26, 30}
      };

      int target1 = 5;
      int target2 = 20;

      System.out.println("Is " + target1 + " present? " + searchMatrix(matrix, target1)); // Output: true
      System.out.println("Is " + target2 + " present? " + searchMatrix(matrix, target2)); // Output: false
  }
}
