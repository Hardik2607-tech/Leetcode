public class FindPeakElement {

    /**
     * Finds a peak element in the array and returns its index.
     * A peak element is one that is strictly greater than its neighbors.
     * Assumes nums[-1] and nums[n] are negative infinity.
     *
     * @param nums the input array
     * @return the index of a peak element
     */
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Binary search for the peak element
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than its next element,
            // then the peak lies on the left side (including mid)
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                // Else the peak lies on the right side (excluding mid)
                left = mid + 1;
            }
        }

        // When left == right, we've found the peak element
        return left;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 3, 1};
        int peakIndex1 = findPeakElement(nums1);
        System.out.println("Peak element index in nums1: " + peakIndex1);
        System.out.println("Peak element value in nums1: " + nums1[peakIndex1]);

        // Test case 2
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};
        int peakIndex2 = findPeakElement(nums2);
        System.out.println("Peak element index in nums2: " + peakIndex2);
        System.out.println("Peak element value in nums2: " + nums2[peakIndex2]);
    }
}
