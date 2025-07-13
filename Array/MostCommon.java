import java.util.*;

public class MostCommon {

    public static String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        String normalized = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = normalized.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word) && word.length() > 0) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        String result = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println("Most Common Word: " + mostCommonWord(paragraph, banned));

        // Optional second test
        String paragraph2 = "a.";
        String[] banned2 = {};
        System.out.println("Most Common Word: " + mostCommonWord(paragraph2, banned2));
    }
}
