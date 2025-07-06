public class LongestIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        return maxLength;
    }

    // Example usage
    public static void main(String[] args) {
        LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();
        int[] nums1 = {1, 3, 5, 4, 7};
        int[] nums2 = {2, 2, 2, 2, 2};
        System.out.println(solution.findLengthOfLCIS(nums1)); // Output: 3
        System.out.println(solution.findLengthOfLCIS(nums2)); // Output: 1
    }
}
