import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);  // Step 1: Sort the array
        int closest = nums[0] + nums[1] + nums[2];  // Initialize with the first three elements

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;  // Left pointer
            int right = nums.length - 1;  // Right pointer

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Update closest sum if the current sum is closer to the target
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Move pointers based on comparison with target
                if (sum < target) {
                    left++;  // Increase sum
                } else if (sum > target) {
                    right--;  // Decrease sum
                } else {
                    // Exact match found
                    return sum;
                }
            }
        }
        return closest;
    }

    // Example usage
    public static void main(String[] args) {
        ThreeSumClosest solver = new ThreeSumClosest();

        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println("Closest sum to " + target1 + " is " + solver.threeSumClosest(nums1, target1));
        // Output: 2

        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println("Closest sum to " + target2 + " is " + solver.threeSumClosest(nums2, target2));
        // Output: 0
    }
}
