import java.util.Arrays;

public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;

        while (i < j) {
            if (nums[i] % 2 > nums[j] % 2) {
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if (nums[i] % 2 == 0) i++;
            if (nums[j] % 2 == 1) j--;
        }

        return nums;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {3, 1, 2, 4};
        System.out.println("Input: " + Arrays.toString(nums1));
        int[] result1 = sortArrayByParity(nums1);
        System.out.println("Output: " + Arrays.toString(result1));

        // Test case 2
        int[] nums2 = {0};
        System.out.println("Input: " + Arrays.toString(nums2));
        int[] result2 = sortArrayByParity(nums2);
        System.out.println("Output: " + Arrays.toString(result2));

        // Test case 3
        int[] nums3 = {2, 4, 6, 1, 3, 5};
        System.out.println("Input: " + Arrays.toString(nums3));
        int[] result3 = sortArrayByParity(nums3);
        System.out.println("Output: " + Arrays.toString(result3));
    }
}
