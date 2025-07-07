public class OneBitAndTwoBitCharacters {

    // Function to determine if the last character is a one-bit character
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        // Traverse the array until the second to last bit
        while (i < bits.length - 1) {
            if (bits[i] == 1) {
                // It's a two-bit character, skip next bit
                i += 2;
            } else {
                // It's a one-bit character
                i += 1;
            }
        }
        // If we're at the last bit, it's a one-bit character
        return i == bits.length - 1;
    }

    // Main method for testing
    public static void main(String[] args) {
        OneBitAndTwoBitCharacters solution = new OneBitAndTwoBitCharacters();

        int[] test1 = {1, 0, 0};
        int[] test2 = {1, 1, 1, 0};

        System.out.println("Test 1 (Expected: true): " + solution.isOneBitCharacter(test1));
        System.out.println("Test 2 (Expected: false): " + solution.isOneBitCharacter(test2));
    }
}
