public class JumpGame {
  public boolean canJump(int[] nums) {
      int maxReach = 0;
      for (int i = 0; i < nums.length; i++) {
          if (i > maxReach) {
              return false; // Can't reach this position
          }
          maxReach = Math.max(maxReach, i + nums[i]);
      }
      return true; // Successfully reached or surpassed the last index
  }

  public static void main(String[] args) {
      JumpGame game = new JumpGame();
      int[] nums1 = {2, 3, 1, 1, 4};
      int[] nums2 = {3, 2, 1, 0, 4};

      System.out.println("Example 1: " + game.canJump(nums1)); // Output: true
      System.out.println("Example 2: " + game.canJump(nums2)); // Output: false
  }
}
