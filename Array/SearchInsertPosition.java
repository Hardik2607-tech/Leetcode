public class SearchInsertPosition {

  // Method to find the index of the target or the insertion point
  public int searchInsert(int[] nums, int target) {
      int low = 0;
      int high = nums.length - 1;

      while (low <= high) {
          int mid = low + (high - low) / 2;
          if (nums[mid] == target) {
              return mid; // Target found at index mid
          } else if (nums[mid] < target) {
              low = mid + 1; // Search in the right half
          } else {
              high = mid - 1; // Search in the left half
          }
      }
      return low; // Insertion point
  }

  // Main method to execute the program
  public static void main(String[] args) {
    SearchInsertPosition solution = new SearchInsertPosition();
      int[] nums = {1, 3, 5, 6};
      int target = 5;
      int result = solution.searchInsert(nums, target);
      System.out.println("Output: " + result); // Expected Output: 2
  }
}
