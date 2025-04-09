public class StockProfitCalculator {

    // Method to calculate the maximum profit
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update maximum profit
            }
        }

        return maxProfit;
    }

    // Main method: entry point of the program
    public static void main(String[] args) {
        StockProfitCalculator calculator = new StockProfitCalculator();

        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int result1 = calculator.maxProfit(prices1);
        System.out.println("Maximum profit for prices1: " + result1); // Output: 5

        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        int result2 = calculator.maxProfit(prices2);
        System.out.println("Maximum profit for prices2: " + result2); // Output: 0
    }
}
