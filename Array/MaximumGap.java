public class MaximumGap {
    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 1};
        int result = maximumGap(nums);
        System.out.println("Maximum gap: " + result);
    }

    public static int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2)
            return 0;

        int min = nums[0], max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (min == max)
            return 0;

        int n = nums.length;
        int bucketSize = Math.max(1, (max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        boolean[] bucketUsed = new boolean[bucketCount];

        for (int i = 0; i < bucketCount; i++) {
            bucketMin[i] = Integer.MAX_VALUE;
            bucketMax[i] = Integer.MIN_VALUE;
        }

        for (int num : nums) {
            int idx = (num - min) / bucketSize;
            bucketMin[idx] = Math.min(bucketMin[idx], num);
            bucketMax[idx] = Math.max(bucketMax[idx], num);
            bucketUsed[idx] = true;
        }

        int maxGap = 0;
        int prevMax = min;

        for (int i = 0; i < bucketCount; i++) {
            if (!bucketUsed[i])
                continue;
            maxGap = Math.max(maxGap, bucketMin[i] - prevMax);
            prevMax = bucketMax[i];
        }

        return maxGap;
    }
}
