public class MajorityElement {
  public int majorityElement(int[] nums) {
      int count = 0;
      Integer candidate = null;

      for (int num : nums) {
          if (count == 0) {
              candidate = num;
          }
          count += (num == candidate) ? 1 : -1;
      }

      return candidate;
  }

  public static void main(String[] args) {
      MajorityElement solution = new MajorityElement();
      int[] nums = {2, 2, 1, 1, 1, 2, 2}; // Example input
      int result = solution.majorityElement(nums);
      System.out.println("Majority element: " + result);
  }
}
