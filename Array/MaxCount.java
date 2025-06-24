public class MaxCount {
  public int maxCount(int m, int n, int[][] ops) {
      int minRow = m;
      int minCol = n;

      for (int[] op : ops) {
          minRow = Math.min(minRow, op[0]);
          minCol = Math.min(minCol, op[1]);
      }

      return minRow * minCol;
  }

  public static void main(String[] args) {
      MaxCount solution = new MaxCount();

      int m1 = 3, n1 = 3;
      int[][] ops1 = {{2, 2}, {3, 3}};
      System.out.println(solution.maxCount(m1, n1, ops1));  // Output: 4

      int[][] ops2 = {{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3}};
      System.out.println(solution.maxCount(m1, n1, ops2));  // Output: 4

      int[][] ops3 = {};
      System.out.println(solution.maxCount(m1, n1, ops3));  // Output: 9
  }
}

