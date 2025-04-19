import java.util.Arrays;

public class CookieDistribution {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // Sort greed factors
        Arrays.sort(s); // Sort cookie sizes

        int child = 0; // Pointer for children
        int cookie = 0; // Pointer for cookies

        // Try to satisfy each child
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++; // Child is content
            }
            cookie++; // Move to next cookie
        }

        return child; // Number of content children
    }

    public static void main(String[] args) {
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println(findContentChildren(g1, s1)); // Output: 1

        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println(findContentChildren(g2, s2)); // Output: 2
    }
}
