import java.util.*;

public class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;  // Get index corresponding to value
            if (nums[index] > 0) {
                nums[index] = -nums[index];     // Mark as visited
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);              // Index + 1 is missing
            }
        }

        return result;
    }

    // Sample Test Case
    public static void main(String[] args) {
        DisappearedNumbers sol = new DisappearedNumbers();
        
        int[] nums1 = {4,3,2,7,8,2,3,1};
        System.out.println(sol.findDisappearedNumbers(nums1));  // Output: [5, 6]

        int[] nums2 = {1,1};
        System.out.println(sol.findDisappearedNumbers(nums2));  // Output: [2]
    }
}
