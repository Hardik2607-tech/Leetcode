public class ValidBoomerang {

    public boolean isBoomerang(int[][] points) {
        // Check that all three points are distinct
        if (isSame(points[0], points[1]) || isSame(points[0], points[2]) || isSame(points[1], points[2])) {
            return false;
        }

        // Use the area method to check if the points are collinear
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        // Area = 0 means points are collinear
        return (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) != 0;
    }

    // Helper function to check if two points are the same
    private boolean isSame(int[] p1, int[] p2) {
        return p1[0] == p2[0] && p1[1] == p2[1];
    }

    // Main method for testing
    public static void main(String[] args) {
        ValidBoomerang sol = new ValidBoomerang();

        int[][] points1 = {{1, 1}, {2, 3}, {3, 2}};
        int[][] points2 = {{1, 1}, {2, 2}, {3, 3}};
        int[][] points3 = {{0, 0}, {1, 1}, {0, 1}};

        System.out.println(sol.isBoomerang(points1)); // true
        System.out.println(sol.isBoomerang(points2)); // false
        System.out.println(sol.isBoomerang(points3)); // true
    }
}

