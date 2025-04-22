public class ContainerWithMostWater {
  public int maxArea(int[] height) {
      int left = 0;                  // Pointer at the beginning
      int right = height.length - 1; // Pointer at the end
      int maxArea = 0;

      while (left < right) {
          // Calculate the current area
          int currentHeight = Math.min(height[left], height[right]);
          int width = right - left;
          int area = currentHeight * width;

          // Update max area if current area is greater
          maxArea = Math.max(maxArea, area);

          // Move the pointer pointing to the shorter line inward
          if (height[left] < height[right]) {
              left++;
          } else {
              right--;
          }
      }

      return maxArea;
  }

  // Test the function
  public static void main(String[] args) {
      ContainerWithMostWater solution = new ContainerWithMostWater();

      int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
      System.out.println("Max area: " + solution.maxArea(height1)); // Output: 49

      int[] height2 = {1, 1};
      System.out.println("Max area: " + solution.maxArea(height2)); // Output: 1
  }
}
