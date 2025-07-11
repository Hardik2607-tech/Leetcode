public class SmallestRange {

    // Function to calculate the smallest possible range after modifying each element by at most ±k
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find min and max in the array
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate the minimized range
        return Math.max(0, max - min - 2 * k);
    }

    // Main method with test cases
    public static void main(String[] args) {
        SmallestRange solution = new SmallestRange();

        int[] nums1 = {1};
        int k1 = 0;
        System.out.println("Output: " + solution.smallestRangeI(nums1, k1)); // Expected: 0

        int[] nums2 = {0, 10};
        int k2 = 2;
        System.out.println("Output: " + solution.smallestRangeI(nums2, k2)); // Expected: 6

        int[] nums3 = {1, 3, 6};
        int k3 = 3;
        System.out.println("Output: " + solution.smallestRangeI(nums3, k3)); // Expected: 0

        int[] nums4 = {4, 8, 12};
        int k4 = 2;
        System.out.println("Output: " + solution.smallestRangeI(nums4, k4)); // Expected: 4
    }
}
