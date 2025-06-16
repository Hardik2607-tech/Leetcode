class NumArray {
  private int[] prefixSums;

  // Constructor to initialize the prefix sums array
  public NumArray(int[] nums) {
      prefixSums = new int[nums.length + 1];
      for (int i = 0; i < nums.length; i++) {
          prefixSums[i + 1] = prefixSums[i] + nums[i];
      }
  }

  // Returns the sum of elements from index left to right (inclusive)
  public int sumRange(int left, int right) {
      return prefixSums[right + 1] - prefixSums[left];
  }
}

public class Main {
  public static void main(String[] args) {
      // Initialize the NumArray with the input array
      NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});

      // Perform sumRange queries
      System.out.println(numArray.sumRange(0, 2)); // Output: 1
      System.out.println(numArray.sumRange(2, 5)); // Output: -1
      System.out.println(numArray.sumRange(0, 5)); // Output: -3
  }
}
