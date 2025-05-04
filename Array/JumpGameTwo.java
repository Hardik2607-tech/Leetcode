public class JumpGameTwo {
  public int jump(int[] nums) {
      int jumps = 0;
      int currentEnd = 0;
      int farthest = 0;

      for (int i = 0; i < nums.length - 1; i++) {
          farthest = Math.max(farthest, i + nums[i]);
          if (i == currentEnd) {
              jumps++;
              currentEnd = farthest;
          }
      }

      return jumps;
  }

  public static void main(String[] args) {
      JumpGameTwo solution = new JumpGameTwo();

      int[] nums1 = {2, 3, 1, 1, 4};
      System.out.println("Output: " + solution.jump(nums1)); // Output: 2

      int[] nums2 = {2, 3, 0, 1, 4};
      System.out.println("Output: " + solution.jump(nums2)); // Output: 2
  }
}
