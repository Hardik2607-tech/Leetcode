public class largestTriangleArea {
  public double largestTriangleArea(int[][] points) {
      double maxArea = 0.0;

      for (int i = 0; i < points.length; i++) {
          for (int j = i + 1; j < points.length; j++) {
              for (int k = j + 1; k < points.length; k++) {
                  maxArea = Math.max(maxArea, triangleArea(points[i], points[j], points[k]));
              }
          }
      }

      return maxArea;
  }

  private double triangleArea(int[] p1, int[] p2, int[] p3) {
      return 0.5 * Math.abs(
          p1[0] * (p2[1] - p3[1]) +
          p2[0] * (p3[1] - p1[1]) +
          p3[0] * (p1[1] - p2[1])
      );
  }

  public static void main(String[] args) {
      largestTriangleArea sol = new largestTriangleArea();

      int[][] points1 = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
      System.out.println("Largest Area (Test 1): " + sol.largestTriangleArea(points1)); // Output: 2.0

      int[][] points2 = {{1, 0}, {0, 0}, {0, 1}};
      System.out.println("Largest Area (Test 2): " + sol.largestTriangleArea(points2)); // Output: 0.5
  }
}
