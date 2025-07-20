public class SurfaceAreaCalculator {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int area = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                int v = grid[i][j];
                if (v > 0) {
                    area += 2;
                    area += v * 4;

                    if (i + 1 < n) {
                        area -= 2 * Math.min(v, grid[i + 1][j]);
                    }

                    if (j + 1 < n) {
                        area -= 2 * Math.min(v, grid[i][j + 1]);
                    }
                }
            }
        }

        return area;
    }

    public static void main(String[] args) {
        SurfaceAreaCalculator calc = new SurfaceAreaCalculator();

        int[][] grid1 = {{1, 2}};
        int[][] grid2 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] grid3 = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};

        System.out.println(calc.surfaceArea(grid1)); // Output: 34
        System.out.println(calc.surfaceArea(grid2)); // Output: 32
        System.out.println(calc.surfaceArea(grid3)); // Output: 46
    }
}
