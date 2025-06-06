public class SingleNumberTwo {
  public static void main(String[] args) {
      int[] nums = {2, 2, 3, 2};
      System.out.println(singleNumber(nums)); // Expect 3
  }

  public static int singleNumber(int[] nums) {
      int ones = 0, twos = 0;
      for (int num : nums) {
          // Track bits that have appeared once and twice
          ones = (ones ^ num) & ~twos;
          twos = (twos ^ num) & ~ones;
      }
      return ones; // 'ones' holds the unique number :contentReference[oaicite:0]{index=0}
  }
}
