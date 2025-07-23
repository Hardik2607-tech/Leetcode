public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0 || duration == 0) {
            return 0;
        }

        int totalPoisonedTime = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            // Calculate time difference between current and next attack
            int timeDiff = timeSeries[i + 1] - timeSeries[i];
            // Add the minimum of duration or timeDiff
            totalPoisonedTime += Math.min(duration, timeDiff);
        }

        // Add full duration for the last attack
        totalPoisonedTime += duration;

        return totalPoisonedTime;
    }

    public static void main(String[] args) {
        TeemoAttacking ta = new TeemoAttacking();

        int[] timeSeries1 = {1, 4};
        int duration1 = 2;
        System.out.println(ta.findPoisonedDuration(timeSeries1, duration1)); // Output: 4

        int[] timeSeries2 = {1, 2};
        int duration2 = 2;
        System.out.println(ta.findPoisonedDuration(timeSeries2, duration2)); // Output: 3
    }
}
