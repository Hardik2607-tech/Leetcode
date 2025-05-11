public class GasStationCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSum = 0;
        int currentSum = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            totalSum += diff;
            currentSum += diff;

            if (currentSum < 0) {
                currentSum = 0;
                startIndex = i + 1;
            }
        }

        return totalSum >= 0 ? startIndex : -1;
    }

    public static void main(String[] args) {
        GasStationCircuit gsc = new GasStationCircuit();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = gsc.canCompleteCircuit(gas, cost);
        System.out.println("Starting station index: " + result);
    }
}
