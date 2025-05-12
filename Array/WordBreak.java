import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict); // Convert list to set for O(1) lookups
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // Empty string can always be segmented

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                // If s[0..j) can be segmented and s[j..i) is in the dictionary
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // No need to check further partitions
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        WordBreak wb = new WordBreak();

        String s1 = "leetcode";
        List<String> wordDict1 = Arrays.asList("leet", "code");
        System.out.println(wb.wordBreak(s1, wordDict1)); // Output: true

        String s2 = "applepenapple";
        List<String> wordDict2 = Arrays.asList("apple", "pen");
        System.out.println(wb.wordBreak(s2, wordDict2)); // Output: true

        String s3 = "catsandog";
        List<String> wordDict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(wb.wordBreak(s3, wordDict3)); // Output: false
    }
}
