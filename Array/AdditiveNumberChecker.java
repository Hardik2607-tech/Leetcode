public class AdditiveNumberChecker {

  public boolean isAdditiveNumber(String num) {
      int n = num.length();
      for (int i = 1; i <= n / 2; i++) {
          // Skip if the number starts with 0 and is longer than 1 digit
          if (num.charAt(0) == '0' && i > 1) break;

          long num1 = Long.parseLong(num.substring(0, i));

          for (int j = i + 1; n - j >= Math.max(i, j - i); j++) {
              if (num.charAt(i) == '0' && j - i > 1) break;

              long num2 = Long.parseLong(num.substring(i, j));

              if (isValid(num1, num2, j, num)) return true;
          }
      }
      return false;
  }

  private boolean isValid(long num1, long num2, int start, String num) {
      if (start == num.length()) return true;

      long sum = num1 + num2;
      String sumStr = String.valueOf(sum);

      if (!num.startsWith(sumStr, start)) return false;

      return isValid(num2, sum, start + sumStr.length(), num);
  }

  public static void main(String[] args) {
      AdditiveNumberChecker checker = new AdditiveNumberChecker();

      System.out.println(checker.isAdditiveNumber("112358"));     // true
      System.out.println(checker.isAdditiveNumber("199100199"));  // true
      System.out.println(checker.isAdditiveNumber("1023"));       // false
  }
}
