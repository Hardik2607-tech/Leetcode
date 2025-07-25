import java.util.*;

public class BinaryPrefixDivisibleBy5 {
    
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int current = 0;

        for (int num : nums) {
            // Shift left and add the current binary digit
            current = (current * 2 + num) % 5;
            result.add(current == 0);
        }

        return result;
    }

    // Example main method to test the code
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 1};
        int[] nums2 = {1, 1, 1};

        System.out.println("Input: [0, 1, 1]");
        System.out.println("Output: " + prefixesDivBy5(nums1)); // [true, false, false]

        System.out.println("Input: [1, 1, 1]");
        System.out.println("Output: " + prefixesDivBy5(nums2)); // [false, false, false]
    }
}

