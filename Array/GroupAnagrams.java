import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to hold sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Convert string to char array, sort it, and convert back to string
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Add the original string to the corresponding list in the map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        // Return all the grouped anagrams
        return new ArrayList<>(map.values());
    }

    // Example usage
    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();

        // Example 1
        String[] input1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(ga.groupAnagrams(input1));

        // Example 2
        String[] input2 = {""};
        System.out.println(ga.groupAnagrams(input2));

        // Example 3
        String[] input3 = {"a"};
        System.out.println(ga.groupAnagrams(input3));
    }
}
