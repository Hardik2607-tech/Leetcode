import java.util.Arrays;

public class MatrixRotation {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Step 1: transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        // Step 2: reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = tmp;
            }
        }
    }

    // For testing
    public static void main(String[] args) {
        MatrixRotation sol = new MatrixRotation();

        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        sol.rotate(matrix1);
        System.out.println("Rotated matrix1: " + Arrays.deepToString(matrix1));
        // Expect: [[7,4,1],[8,5,2],[9,6,3]]

        int[][] matrix2 = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
        sol.rotate(matrix2);
        System.out.println("Rotated matrix2: " + Arrays.deepToString(matrix2));
        // Expect: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
    }
}
