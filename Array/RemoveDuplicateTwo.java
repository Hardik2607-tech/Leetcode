public class RemoveDuplicateTwo {
  // Remove duplicates allowing at most two occurrences
  public int removeDuplicates(int[] nums) {
      int k = 0;
      for (int num : nums) {
          if (k < 2 || num != nums[k - 2]) {
              nums[k++] = num;
          }
      }
      return k;
  }

  // Entry point to test multiple cases
  public static void main(String[] args) {
      RemoveDuplicateTwo sol = new RemoveDuplicateTwo();

      int[] nums1 = {1,1,1,2,2,3};
      int k1 = sol.removeDuplicates(nums1);
      System.out.println("k1 = " + k1 + ", nums1 = " +
          java.util.Arrays.toString(java.util.Arrays.copyOf(nums1, k1)));

      int[] nums2 = {0,0,1,1,1,1,2,3,3};
      int k2 = sol.removeDuplicates(nums2);
      System.out.println("k2 = " + k2 + ", nums2 = " +
          java.util.Arrays.toString(java.util.Arrays.copyOf(nums2, k2)));
  }
}
