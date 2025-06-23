import java.util.*;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        // Traverse nums2 from left to right
        for (int num : nums2) {
            // If stack is not empty and current num is greater than stack's top, it's the next greater
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Elements left in the stack have no next greater, so map to -1
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

        // Build result for nums1 based on the map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }

    // For testing
    public static void main(String[] args) {
        NextGreaterElement nge = new NextGreaterElement();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nge.nextGreaterElement(nums1, nums2))); // Output: [-1, 3, -1]

        int[] nums3 = {2, 4};
        int[] nums4 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(nge.nextGreaterElement(nums3, nums4))); // Output: [3, -1]
    }
}
