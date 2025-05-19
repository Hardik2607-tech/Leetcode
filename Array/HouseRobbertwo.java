public class HouseRobbertwo {
    public static void main(String[] args) {
        HouseRobbertwo solution = new HouseRobbertwo();
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2, 3, 1};
        int[] nums3 = {1, 2, 3};

        System.out.println(solution.rob(nums1)); // Output: 3
        System.out.println(solution.rob(nums2)); // Output: 4
        System.out.println(solution.rob(nums3)); // Output: 3
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        // Scenario 1: Exclude the last house
        int max1 = robLinear(nums, 0, n - 2);
        // Scenario 2: Exclude the first house
        int max2 = robLinear(nums, 1, n - 1);

        return Math.max(max1, max2);
    }

    private int robLinear(int[] nums, int start, int end) {
        int prev = 0, curr = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(curr, prev + nums[i]);
            prev = curr;
            curr = temp;
        }
        return curr;
    }
}
