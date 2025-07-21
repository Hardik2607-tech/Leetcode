import java.util.Arrays;

public class LargestPerimeterTriangle {

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums); // Sort the array
        // Traverse from the end to find the first valid triangle
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0; // No valid triangle found
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(largestPerimeter(new int[]{2, 1, 2}));       // Output: 5
        System.out.println(largestPerimeter(new int[]{1, 2, 1, 10}));   // Output: 0
        System.out.println(largestPerimeter(new int[]{3, 6, 2, 3}));    // Output: 8
        System.out.println(largestPerimeter(new int[]{1, 1, 1, 3, 3})); // Output: 7
        System.out.println(largestPerimeter(new int[]{10, 15, 7}));     // Output: 32
    }
}
