public class MinSort {

  public static void main(String[] args) {
      int[] nums = {3, 4, 5, 1, 2};
      int min = findMin(nums);
      System.out.println("Minimum element is: " + min);
  }

  public static int findMin(int[] nums) {
      int left = 0, right = nums.length - 1;

      // If the array is not rotated
      if (nums[left] <= nums[right]) {
          return nums[left];
      }

      while (left < right) {
          int mid = left + (right - left) / 2;

          // If mid element is greater than the rightmost element,
          // the minimum is in the right half
          if (nums[mid] > nums[right]) {
              left = mid + 1;
          } else {
              // Minimum is in the left half including mid
              right = mid;
          }
      }

      // At the end of loop, left == right pointing to the minimum element
      return nums[left];
  }
}
