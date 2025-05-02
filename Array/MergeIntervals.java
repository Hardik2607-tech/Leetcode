import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort the intervals by their starting points
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);

        for (int[] interval : intervals) {
            if (interval[0] <= current[1]) {
                // Overlapping intervals, merge them
                current[1] = Math.max(current[1], interval[1]);
            } else {
                // Disjoint interval, add to the list
                current = interval;
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    // Helper method to print the result
    public static void printIntervals(int[][] intervals) {
        for (int[] interval : intervals) {
            System.out.print(Arrays.toString(interval) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] example1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] example2 = {{1, 4}, {4, 5}};

        printIntervals(merge(example1));  // Output: [1,6] [8,10] [15,18]
        printIntervals(merge(example2));  // Output: [1,5]
    }
}
