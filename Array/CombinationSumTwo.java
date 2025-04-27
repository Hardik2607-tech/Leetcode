import java.util.*;

public class CombinationSumTwo {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        backtrack(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> results) {
        if (target == 0) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // If current candidate is greater than target, no point in exploring further
            if (candidates[i] > target) break;

            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, current, results);
            current.remove(current.size() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        CombinationSumTwo solution = new CombinationSumTwo();

        int[] candidates1 = {10,1,2,7,6,1,5};
        int target1 = 8;
        System.out.println(solution.combinationSum2(candidates1, target1));

        int[] candidates2 = {2,5,2,1,2};
        int target2 = 5;
        System.out.println(solution.combinationSum2(candidates2, target2));
    }
}
