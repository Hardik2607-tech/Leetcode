import java.util.*;

public class ThirdMaxFinder {
    public int thirdMax(int[] nums) {
        // Use a TreeSet in descending order to keep only distinct values in sorted order
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : nums) {
            set.add(num);
        }

        // If less than 3 distinct numbers, return the largest
        if (set.size() < 3) {
            return set.first(); // largest
        }

        // Remove the top two to get the third max
        set.pollFirst(); // removes largest
        set.pollFirst(); // removes second largest

        return set.first(); // third largest
    }

    public static void main(String[] args) {
        ThirdMaxFinder finder = new ThirdMaxFinder();

        System.out.println(finder.thirdMax(new int[]{3, 2, 1}));    // Output: 1
        System.out.println(finder.thirdMax(new int[]{1, 2}));       // Output: 2
        System.out.println(finder.thirdMax(new int[]{2, 2, 3, 1})); // Output: 1
    }
}
