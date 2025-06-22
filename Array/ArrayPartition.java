import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  // Sort the array
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; // Take the first number in each pair
        }
        return sum;
    }

    // Test the function
    public static void main(String[] args) {
        ArrayPartition solution = new ArrayPartition();

        // Test case 1
        int[] nums1 = {1, 4, 3, 2};
        System.out.println("Output: " + solution.arrayPairSum(nums1)); // Expected: 4

        // Test case 2
        int[] nums2 = {6, 2, 6, 5, 1, 2};
        System.out.println("Output: " + solution.arrayPairSum(nums2)); // Expected: 9
    }
}
