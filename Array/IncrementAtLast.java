import java.util.Arrays;

public class IncrementAtLast {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {4, 3, 2, 1};
        int[] input3 = {9};

        System.out.println("Output 1: " + Arrays.toString(plusOne(input1))); // [1, 2, 4]
        System.out.println("Output 2: " + Arrays.toString(plusOne(input2))); // [4, 3, 2, 2]
        System.out.println("Output 3: " + Arrays.toString(plusOne(input3))); // [1, 0]
    }
}
