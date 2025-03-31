public class RemoveElement {
  public int removeElement(int[] nums, int val) {
      int k = 0; // Write pointer
      for (int i = 0; i < nums.length; i++) {
          if (nums[i] != val) {
              nums[k] = nums[i];
              k++;
          }
      }
      return k;
  }

  public static void main(String[] args) {
      RemoveElement solution = new RemoveElement();
      int[] nums = {3, 2, 2, 3};
      int val = 3;
      int k = solution.removeElement(nums, val);
      System.out.println("Number of elements not equal to val: " + k);
      System.out.print("Modified array: ");
      for (int i = 0; i < k; i++) {
          System.out.print(nums[i] + " ");
      }
  }
}
