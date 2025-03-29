import java.util.Arrays;

class TwoSum {
    public int[] twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null; // No valid pair found
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        // Example test case
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twosum(nums, target);
        
        if (result != null) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No solution found.");
        }
    }
}
