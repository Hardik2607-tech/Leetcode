public class MergeSortedArrays {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i = m - 1; // Pointer for nums1's valid elements
      int j = n - 1; // Pointer for nums2
      int k = m + n - 1; // Pointer for final position in nums1

      // Merge from the end
      while (i >= 0 && j >= 0) {
          if (nums1[i] > nums2[j]) {
              nums1[k--] = nums1[i--];
          } else {
              nums1[k--] = nums2[j--];
          }
      }

      // If any elements left in nums2, copy them
      while (j >= 0) {
          nums1[k--] = nums2[j--];
      }
  }

  public static void main(String[] args) {
      MergeSortedArrays solution = new MergeSortedArrays();

      int[] nums1 = {1, 2, 3, 0, 0, 0};
      int[] nums2 = {2, 5, 6};
      solution.merge(nums1, 3, nums2, 3);
      System.out.println(java.util.Arrays.toString(nums1)); // [1, 2, 2, 3, 5, 6]
  }
}
