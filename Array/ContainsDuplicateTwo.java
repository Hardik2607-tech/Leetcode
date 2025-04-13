import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateTwo {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numIndices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer previousIndex = numIndices.get(nums[i]);
            if (previousIndex != null && i - previousIndex <= k) {
                return true;
            }
            numIndices.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateTwo solution = new ContainsDuplicateTwo();

        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println(solution.containsNearbyDuplicate(nums1, k1)); // Output: true

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println(solution.containsNearbyDuplicate(nums2, k2)); // Output: true

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println(solution.containsNearbyDuplicate(nums3, k3)); // Output: false
    }
}
