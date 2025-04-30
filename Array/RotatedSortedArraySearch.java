public class RotatedSortedArraySearch {
  public static int search(int[] nums, int target) {
      int left = 0, right = nums.length - 1;

      while (left <= right) {
          int mid = left + (right - left) / 2;

          // Check if mid is the target
          if (nums[mid] == target) {
              return mid;
          }

          // Determine which side is properly sorted
          if (nums[left] <= nums[mid]) {
              // Left side is sorted
              if (nums[left] <= target && target < nums[mid]) {
                  // Target is in the left half
                  right = mid - 1;
              } else {
                  // Target is in the right half
                  left = mid + 1;
              }
          } else {
              // Right side is sorted
              if (nums[mid] < target && target <= nums[right]) {
                  // Target is in the right half
                  left = mid + 1;
              } else {
                  // Target is in the left half
                  right = mid - 1;
              }
          }
      }

      // Target not found
      return -1;
  }

  public static void main(String[] args) {
      // Example 1
      int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
      int target1 = 0;
      System.out.println("Output: " + search(nums1, target1)); // Output: 4

      // Example 2
      int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
      int target2 = 3;
      System.out.println("Output: " + search(nums2, target2)); // Output: -1

      // Example 3
      int[] nums3 = {1};
      int target3 = 0;
      System.out.println("Output: " + search(nums3, target3)); // Output: -1
  }
}

