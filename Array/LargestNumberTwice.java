public class LargestNumberTwice {
    public static void main(String[] args) {
        int[] nums1 = {3, 6, 1, 0};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println(dominantIndex(nums1)); // Output: 1
        System.out.println(dominantIndex(nums2)); // Output: -1
    }

    public static int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        int maxIndex = 0;

        // Find index of the largest number
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Check if the largest number is at least twice all others
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[maxIndex] < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}
