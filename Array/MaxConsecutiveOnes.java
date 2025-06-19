public class MaxConsecutiveOnes {
  public static int findMaxConsecutiveOnes(int[] nums) {
      int maxCount = 0;
      int currentCount = 0;

      for (int num : nums) {
          if (num == 1) {
              currentCount++;
              maxCount = Math.max(maxCount, currentCount);
          } else {
              currentCount = 0;
          }
      }

      return maxCount;
  }

  public static void main(String[] args) {
      int[] nums1 = {1, 1, 0, 1, 1, 1};
      int[] nums2 = {1, 0, 1, 1, 0, 1};

      System.out.println("Output 1: " + findMaxConsecutiveOnes(nums1)); // Output: 3
      System.out.println("Output 2: " + findMaxConsecutiveOnes(nums2)); // Output: 2
  }
}
