 import java.util.*;

public class DegreeOfArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> firstIndex = new HashMap<>();
        Map<Integer, Integer> lastIndex = new HashMap<>();
        
        int degree = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (!firstIndex.containsKey(num)) {
                firstIndex.put(num, i);
            }
            lastIndex.put(num, i);
            degree = Math.max(degree, count.get(num));
        }
        
        int minLength = nums.length;
        
        for (int num : count.keySet()) {
            if (count.get(num) == degree) {
                int len = lastIndex.get(num) - firstIndex.get(num) + 1;
                minLength = Math.min(minLength, len);
            }
        }
        
        return minLength;
    }

    // Sample usage
    public static void main(String[] args) {
        DegreeOfArray solution = new DegreeOfArray();
        System.out.println(solution.findShortestSubArray(new int[]{1,2,2,3,1})); // Output: 2
        System.out.println(solution.findShortestSubArray(new int[]{1,2,2,3,1,4,2})); // Output: 6
    }
}

