import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

    // Method to find all valid combinations
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k, n, 1, new ArrayList<>(), result);
        return result;
    }

    // Helper method for backtracking
    private void backtrack(int k, int remaining, int start, List<Integer> path, List<List<Integer>> result) {
        if (k == 0 && remaining == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (k == 0 || remaining < 0) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            path.add(i);
            backtrack(k - 1, remaining - i, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }

    // Main method to execute test cases
    public static void main(String[] args) {
        CombinationSumIII solver = new CombinationSumIII();

        System.out.println("Test Case 1: k = 3, n = 7");
        System.out.println(solver.combinationSum3(3, 7)); // Expected Output: [[1, 2, 4]]

        System.out.println("Test Case 2: k = 3, n = 9");
        System.out.println(solver.combinationSum3(3, 9)); // Expected Output: [[1, 2, 6], [1, 3, 5], [2, 3, 4]]

        System.out.println("Test Case 3: k = 4, n = 1");
        System.out.println(solver.combinationSum3(4, 1)); // Expected Output: []
    }
}

