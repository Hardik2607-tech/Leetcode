public import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // Sort the array to bring duplicates together
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        // Add a copy of the current subset to the result
        result.add(new ArrayList<>(current));
        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue;
            // Include nums[i] in the current subset
            current.add(nums[i]);
            // Move on to the next element
            backtrack(nums, i + 1, current, result);
            // Backtrack and remove nums[i] from the current subset
            current.remove(current.size() - 1);
        }
    }
}
 {
  
}
