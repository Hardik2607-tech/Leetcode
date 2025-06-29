public class SetMisMatch {

    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        int duplicate = -1;
        int sum = 0;

        for (int num : nums) {
            if (seen[num]) {
                duplicate = num;
            }
            seen[num] = true;
            sum += num;
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - (sum - duplicate);

        return new int[]{duplicate, missing};
    }

    // Test cases in the main method
    public static void main(String[] args) {
         SetMisMatch sol = new SetMisMatch();

        int[] result1 = sol.findErrorNums(new int[]{1, 2, 2, 4});
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]"); // Output: [2, 3]

        int[] result2 = sol.findErrorNums(new int[]{1, 1});
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]"); // Output: [1, 2]

        int[] result3 = sol.findErrorNums(new int[]{2, 2});
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]"); // Output: [2, 1]
    }
}


