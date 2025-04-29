import java.util.*;

public class PermutationTwo {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums); // Sort to handle duplicates
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>(), results);
        return results;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> results) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip used elements
            if (used[i]) continue;
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, used, current, results);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    // Example usage
    public static void main(String[] args) {
        PermutationTwo up = new PermutationTwo();

        int[] nums1 = {1, 1, 2};
        System.out.println("Permutations for [1, 1, 2]:");
        List<List<Integer>> result1 = up.permuteUnique(nums1);
        for (List<Integer> perm : result1) {
            System.out.println(perm);
        }

        int[] nums2 = {1, 2, 3};
        System.out.println("\nPermutations for [1, 2, 3]:");
        List<List<Integer>> result2 = up.permuteUnique(nums2);
        for (List<Integer> perm : result2) {
            System.out.println(perm);
        }
    }
}
