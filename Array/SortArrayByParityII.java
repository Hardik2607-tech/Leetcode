public class SortArrayByParityII {

    public static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int evenIndex = 0;
        int oddIndex = 1;
        
        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }
        
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums1 = {4, 2, 5, 7};
        int[] result1 = sortArrayByParityII(nums1);
        printArray(result1);  // Example output: [4, 5, 2, 7]

        int[] nums2 = {2, 3};
        int[] result2 = sortArrayByParityII(nums2);
        printArray(result2);  // Example output: [2, 3]
    }

    // Utility method to print arrays
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
