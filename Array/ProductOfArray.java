public class ProductOfArray {
  public static void main(String[] args) {
      int[] nums = {1, 2, 3, 4};
      int[] result = productExceptSelf(nums);

      for (int val : result) {
          System.out.print(val + " ");
      }
  }

  public static int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] answer = new int[n];

      // Initialize the answer array with 1s
      for (int i = 0; i < n; i++) {
          answer[i] = 1;
      }

      // Calculate prefix products
      int prefix = 1;
      for (int i = 0; i < n; i++) {
          answer[i] = prefix;
          prefix *= nums[i];
      }

      // Calculate suffix products and multiply with prefix products
      int suffix = 1;
      for (int i = n - 1; i >= 0; i--) {
          answer[i] *= suffix;
          suffix *= nums[i];
      }

      return answer;
  }
}
