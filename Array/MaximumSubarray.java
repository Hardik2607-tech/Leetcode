public class MaximumSubarray {
  public int maxSubArray(int[] nums) {
      int maxSoFar = nums[0];
      int currentMax = nums[0];

      for (int i = 1; i < nums.length; i++) {
          currentMax = Math.max(nums[i], currentMax + nums[i]);
          maxSoFar = Math.max(maxSoFar, currentMax);
      }

      return maxSoFar;
  }

  public static void main(String[] args) {
      MaximumSubarray solution = new MaximumSubarray();

      int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
      System.out.println("Maximum subarray sum: " + solution.maxSubArray(nums1)); // Output: 6

      int[] nums2 = {1};
      System.out.println("Maximum subarray sum: " + solution.maxSubArray(nums2)); // Output: 1

      int[] nums3 = {5, 4, -1, 7, 8};
      System.out.println("Maximum subarray sum: " + solution.maxSubArray(nums3)); // Output: 23
  }
}
