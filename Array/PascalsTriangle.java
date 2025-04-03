import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case; the first row is always [1].
        if (numRows <= 0) {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Generate each row
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // First element is always 1
            row.add(1);

            // Each element (except the first and last) is the sum of the two elements above it
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element is always 1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();
        int numRows = 5; // Example: generate 5 rows
        List<List<Integer>> triangle = pt.generate(numRows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
