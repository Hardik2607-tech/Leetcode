public class shortestCompletingWord {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        String result = sol.findShortestCompletingWord(licensePlate, words);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public String findShortestCompletingWord(String licensePlate, String[] words) {
        int[] targetFreq = getLetterFrequencies(licensePlate);
        String result = null;

        for (String word : words) {
            if (isCompletingWord(word, targetFreq)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }

    private int[] getLetterFrequencies(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                freq[Character.toLowerCase(c) - 'a']++;
            }
        }
        return freq;
    }

    private boolean isCompletingWord(String word, int[] targetFreq) {
        int[] wordFreq = new int[26];
        for (char c : word.toCharArray()) {
            wordFreq[Character.toLowerCase(c) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < targetFreq[i]) {
                return false;
            }
        }

        return true;
    }
}
