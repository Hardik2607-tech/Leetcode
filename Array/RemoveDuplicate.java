public class RemoveDuplicate {
  
  public int removeDuplicates(int[] nums) {
      if (nums.length <= 1) return nums.length;

      int index = 1; 

      for (int i = 1; i < nums.length; i++) {
          if (nums[index - 1] != nums[i]) {
              nums[index] = nums[i];
              index++;
          }
      }

      return index; 
  }

  
  public static void main(String[] args) {
    RemoveDuplicate RemoveDuplicate = new RemoveDuplicate();
      int[] nums = {1, 1, 2};
      int k = RemoveDuplicate.removeDuplicates(nums);
      System.out.println("Number of unique elements: " + k);
      System.out.print("Modified array: ");
      for (int i = 0; i < k; i++) {
          System.out.print(nums[i] + " ");
      }
  }
}
