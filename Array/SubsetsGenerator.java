import java.util.ArrayList;
import java.util.List;

public class SubsetsGenerator {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(new ArrayList<>(), 0, nums, result);
        return result;
    }

    private void generateSubsets(List<Integer> current, int index, int[] nums, List<List<Integer>> result) {
        // Add the current subset to the result list
        result.add(new ArrayList<>(current));

        // Explore further elements to include in the subset
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]); // Include nums[i]
            generateSubsets(current, i + 1, nums, result); // Recurse
            current.remove(current.size() - 1); // Backtrack
        }
    }

    // Example usage
    public static void main(String[] args) {
        SubsetsGenerator sg = new SubsetsGenerator();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {0};

        System.out.println("Subsets of [1, 2, 3]: " + sg.subsets(nums1));
        System.out.println("Subsets of [0]: " + sg.subsets(nums2));
    }
}
