public class PivotIndex {

    // Method to find the pivot index
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1; // No pivot index found
    }

    // Main method to test the pivotIndex function
    public static void main(String[] args) {
        PivotIndex solution = new PivotIndex();

        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot index of nums1: " + solution.pivotIndex(nums1)); // Output: 3

        int[] nums2 = {1, 2, 3};
        System.out.println("Pivot index of nums2: " + solution.pivotIndex(nums2)); // Output: -1

        int[] nums3 = {2, 1, -1};
        System.out.println("Pivot index of nums3: " + solution.pivotIndex(nums3)); // Output: 0
    }
}
