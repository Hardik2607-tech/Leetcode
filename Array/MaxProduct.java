  import java.util.Arrays;
public class MaxProduct {



    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // Case 1: Product of the three largest numbers
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: Product of two smallest (possibly negative) and the largest
        int product2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(product1, product2);
    }

    // Main method to test the function
    public static void main(String[] args) {
        MaxProduct sol = new MaxProduct();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {-1, -2, -3};
        int[] nums4 = {-10, -10, 5, 2};

        System.out.println("Example 1 Output: " + sol.maximumProduct(nums1)); // 6
        System.out.println("Example 2 Output: " + sol.maximumProduct(nums2)); // 24
        System.out.println("Example 3 Output: " + sol.maximumProduct(nums3)); // -6
        System.out.println("Extra Example Output: " + sol.maximumProduct(nums4)); // 500
    }
}


