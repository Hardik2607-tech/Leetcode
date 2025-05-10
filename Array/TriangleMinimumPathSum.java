import java.util.ArrayList;
import java.util.List;

public class TriangleMinimumPathSum {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        // Initialize dp with the last row of the triangle
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        // Bottom-up calculation
        for (int layer = n - 2; layer >= 0; layer--) {
            for (int i = 0; i <= layer; i++) {
                dp[i] = triangle.get(layer).get(i) + Math.min(dp[i], dp[i + 1]);
            }
        }

        return dp[0];
    }

    // Method to print the triangle with proper indentation
    public void printTriangle(List<List<Integer>> triangle) {
        int n = triangle.size();
        for (int i = 0; i < n; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print the numbers in the current row
            for (int num : triangle.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        TriangleMinimumPathSum solver = new TriangleMinimumPathSum();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3, 4));
        triangle.add(List.of(6, 5, 7));
        triangle.add(List.of(4, 1, 8, 3));

        // Print the triangle
        System.out.println("Triangle:");
        solver.printTriangle(triangle);

        // Calculate and print the minimum path sum
        int result = solver.minimumTotal(triangle);
        System.out.println("Minimum path sum: " + result);
    }
}
