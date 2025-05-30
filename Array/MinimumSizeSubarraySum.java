public class MinimumSizeSubarraySum {
  public int minSubArrayLen(int target, int[] nums) {
      int n = nums.length;
      int minLength = Integer.MAX_VALUE;
      int left = 0, sum = 0;

      for (int right = 0; right < n; right++) {
          sum += nums[right];

          while (sum >= target) {
              minLength = Math.min(minLength, right - left + 1);
              sum -= nums[left];
              left++;
          }
      }

      return (minLength != Integer.MAX_VALUE) ? minLength : 0;
  }

  public static void main(String[] args) {
      MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

      int[] nums1 = {2, 3, 1, 2, 4, 3};
      int target1 = 7;
      System.out.println("Output: " + solution.minSubArrayLen(target1, nums1)); // Output: 2

      int[] nums2 = {1, 4, 4};
      int target2 = 4;
      System.out.println("Output: " + solution.minSubArrayLen(target2, nums2)); // Output: 1

      int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
      int target3 = 11;
      System.out.println("Output: " + solution.minSubArrayLen(target3, nums3)); // Output: 0
  }
}
