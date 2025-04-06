import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleAdvance {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // The first row is always [1]

        for (int i = 1; i <= rowIndex; i++) {
            row.add(0); // Append a dummy element to facilitate in-place updates
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }

    public static void main(String[] args) {
        PascalsTriangleAdvance solution = new PascalsTriangleAdvance();
        int rowIndex = 3;
        List<Integer> result = solution.getRow(rowIndex);
        System.out.println(result); // Output: [1, 3, 3, 1]
    }
}
