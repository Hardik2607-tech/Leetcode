import java.util.*;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        int start = nums[0];  // Start of a potential range

        for (int i = 1; i < nums.length; i++) {
            // If the current number is not consecutive
            if (nums[i] != nums[i - 1] + 1) {
                // Add the current range to result
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];  // Start a new range
            }
        }

        // Add the last range
        if (start == nums[nums.length - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + nums[nums.length - 1]);
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        SummaryRanges sr = new SummaryRanges();
        System.out.println(sr.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(sr.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }
}
