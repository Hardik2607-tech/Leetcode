import java.util.*;

public class CommonCharacters {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (String word : words) {
            int[] freq = new int[26];
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i]-- > 0) {
                result.add(String.valueOf((char)(i + 'a')));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CommonCharacters solution = new CommonCharacters();
        System.out.println(solution.commonChars(new String[]{"bella", "label", "roller"})); // ["e","l","l"]
        System.out.println(solution.commonChars(new String[]{"cool", "lock", "cook"}));    // ["c","o"]
    }
}

