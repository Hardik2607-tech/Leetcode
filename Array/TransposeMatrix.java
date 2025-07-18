import java.util.Arrays;

public class TransposeMatrix {
    
    // Method to transpose the matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] transposed = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        
        return transposed;
    }

    // Helper method to print 2D arrays
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test Case 1
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix1);
        System.out.println("Transposed Matrix:");
        printMatrix(transpose(matrix1));

        // Test Case 2
        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix2);
        System.out.println("Transposed Matrix:");
        printMatrix(transpose(matrix2));
    }
}
