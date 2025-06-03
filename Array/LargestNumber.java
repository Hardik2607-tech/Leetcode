import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        // Convert int array to String array
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Custom sort: compare combined strings
        Arrays.sort(strNums, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // descending
            }
        });

        // Edge case: if highest number is "0", the result is "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the result
        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
            result.append(str);
        }

        return result.toString();
    }

    // Main method to test
    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();
        System.out.println(ln.largestNumber(new int[]{10, 2}));        // Output: "210"
        System.out.println(ln.largestNumber(new int[]{3, 30, 34, 5, 9})); // Output: "9534330"
    }
}
