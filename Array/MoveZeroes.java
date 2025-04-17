public class MoveZeroes {
  public static void moveZeroes(int[] nums) {
      int insertPos = 0;

      // Move non-zero values forward
      for (int num : nums) {
          if (num != 0) {
              nums[insertPos++] = num;
          }
      }

      // Fill the remaining positions with zero
      while (insertPos < nums.length) {
          nums[insertPos++] = 0;
      }
  }

  public static void main(String[] args) {
      int[] nums1 = {0, 1, 0, 3, 12};
      moveZeroes(nums1);
      System.out.println(java.util.Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

      int[] nums2 = {0};
      moveZeroes(nums2);
      System.out.println(java.util.Arrays.toString(nums2)); // Output: [0]
  }
}