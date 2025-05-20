public class HouseRobbery {
  public static void main(String[] args) {
      int[] nums = {2, 7, 9, 3, 1}; // Example input
      int result = rob(nums);
      System.out.println("Maximum amount that can be robbed: " + result);
  }

  public static int rob(int[] nums) {
      int prev1 = 0; // Max money till the previous house
      int prev2 = 0; // Max money till the house before the previous

      for (int num : nums) {
          int temp = prev1;
          prev1 = Math.max(prev2 + num, prev1);
          prev2 = temp;
      }

      return prev1;
  }
}
