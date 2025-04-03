public class MaximumTripletValue {

    // Your existing methods and logic

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Example usage:
        MaximumTripletValue solution = new MaximumTripletValue();
        int[] nums = {1000000, 1, 1000000}; // Example input
        long result = solution.maximumTripletValue(nums);
        System.out.println("Maximum Triplet Value: " + result);
    }

    // Your existing maximumTripletValue method
    public long maximumTripletValue(int[] nums) {
        long maxValue = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long currentValue = (long)(nums[i] - nums[j]) * nums[k];
                    maxValue = Math.max(maxValue, currentValue);
                }
            }
        }

        return maxValue;
    }
}
