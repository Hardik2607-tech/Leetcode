import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> uniqueCandies = new HashSet<>();
        
        // Add each candy type to the set (duplicates automatically ignored)
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        
        // Maximum she can eat is n / 2
        int maxCandies = candyType.length / 2;
        
        // Return the smaller of unique types and max she can eat
        return Math.min(uniqueCandies.size(), maxCandies);
    }

    public static void main(String[] args) {
        DistributeCandies solution = new DistributeCandies();
        System.out.println(solution.distributeCandies(new int[]{1,1,2,2,3,3})); // Output: 3
        System.out.println(solution.distributeCandies(new int[]{1,1,2,3}));     // Output: 2
        System.out.println(solution.distributeCandies(new int[]{6,6,6,6}));     // Output: 1
    }
}

