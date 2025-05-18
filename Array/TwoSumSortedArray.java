public class TwoSumSortedArray {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                // Return 1-based indices
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++; // Move left pointer to the right
            } else {
                right--; // Move right pointer to the left
            }
        }

        // The problem guarantees exactly one solution, so this line should never be reached.
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSumSortedArray solver = new TwoSumSortedArray();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solver.twoSum(numbers, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
