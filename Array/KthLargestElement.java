import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    // Method 1: Using Sorting
    public static int findKthLargestBySorting(int[] nums, int k) {
        // Convert int[] to Integer[] for Collections.reverseOrder()
        Integer[] numsInteger = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsInteger, Collections.reverseOrder());
        return numsInteger[k - 1];
    }

    // Method 2: Using Min-Heap
    public static int findKthLargestByHeap(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element
            }
        }
        return minHeap.peek(); // The root of the heap is the kth largest element
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("Example 1:");
        System.out.println("Using Sorting: " + findKthLargestBySorting(nums1, k1)); // Output: 5
        System.out.println("Using Min-Heap: " + findKthLargestByHeap(nums1, k1));   // Output: 5

        // Example 2
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println("\nExample 2:");
        System.out.println("Using Sorting: " + findKthLargestBySorting(nums2, k2)); // Output: 4
        System.out.println("Using Min-Heap: " + findKthLargestByHeap(nums2, k2));   // Output: 4
    }
}
