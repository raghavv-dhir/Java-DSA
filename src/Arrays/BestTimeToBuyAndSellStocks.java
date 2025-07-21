package Arrays;

public class BestTimeToBuyAndSellStocks {
    //Leetcode 121
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int ans = solution(arr);
        System.out.println(ans);
    }
    static int solution(int[] prices) {
        // Initialize minPriceSoFar to a very large value (so any price will be smaller)
        int minPriceSoFar = Integer.MAX_VALUE;

        // maxProfit will store the maximum profit we can get
        int maxProfit = 0;

        // Loop through each day's stock price
        for (int price : prices) {

            // If today's price is lower than our recorded minimum, update it
            // This simulates "buying" at the lowest possible price so far
            if (price < minPriceSoFar) {
                minPriceSoFar = price;
            }

            // Calculate profit if we sell today (i.e., price - minPriceSoFar)
            // Update maxProfit if this profit is better than our current best
            if (price - minPriceSoFar > maxProfit) {
                maxProfit = price - minPriceSoFar;
            }
        }

        // Return the maximum profit that can be made
        // If no profit is possible, it returns 0
        return maxProfit;
    }

}
