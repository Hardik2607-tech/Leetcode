import java.util.*;

public class AlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        // Map each character in the alien order to its index
        int[] alienIndex = new int[26];
        for (int i = 0; i < order.length(); i++) {
            alienIndex[order.charAt(i) - 'a'] = i;
        }

        // Compare each adjacent pair of words
        for (int i = 0; i < words.length - 1; i++) {
            if (!inCorrectOrder(words[i], words[i + 1], alienIndex)) {
                return false;
            }
        }

        return true;
    }

    // Compare two words according to alien dictionary
    private boolean inCorrectOrder(String word1, String word2, int[] alienIndex) {
        int len = Math.min(word1.length(), word2.length());

        for (int i = 0; i < len; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            if (c1 != c2) {
                return alienIndex[c1 - 'a'] < alienIndex[c2 - 'a'];
            }
        }

        // If all characters match up to the shortest length,
        // then the shorter word should come first.
        return word1.length() <= word2.length();
    }

    // Main method for quick testing
    public static void main(String[] args) {
        AlienDictionary ad = new AlienDictionary();
        System.out.println(ad.isAlienSorted(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz")); // true
        System.out.println(ad.isAlienSorted(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz")); // false
        System.out.println(ad.isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz")); // false
    }
}
