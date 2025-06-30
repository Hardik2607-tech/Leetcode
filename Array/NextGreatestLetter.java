public class NextGreatestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return letters[left % letters.length];
    }

    public static void main(String[] args) {
        // Example 1
        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';
        System.out.println("Output 1: " + nextGreatestLetter(letters1, target1)); // Expected: c

        // Example 2
        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'c';
        System.out.println("Output 2: " + nextGreatestLetter(letters2, target2)); // Expected: f

        // Example 3
        char[] letters3 = {'x', 'x', 'y', 'y'};
        char target3 = 'z';
        System.out.println("Output 3: " + nextGreatestLetter(letters3, target3)); // Expected: x

        // Additional test
        char[] letters4 = {'a', 'b'};
        char target4 = 'z';
        System.out.println("Output 4: " + nextGreatestLetter(letters4, target4)); // Expected: a
    }
}
