package Arrays;

public class BestTimeToBuyAndSellStocks2 {
    public static void main(String[] args) {
        //Leetcode 122
        int[] arr = {7,1,5,3,6,4};
        int ans = solution(arr);
        System.out.println(ans);
    }
    static int solution(int[] prices) {
        // This will store the total profit earned from all profitable transactions
        int maxProfit = 0;

        // Start from day 1 and check each pair of consecutive days
        for (int i = 1; i < prices.length; i++) {

            // If today's price is higher than yesterday's,
            // we can pretend we bought yesterday and sold today (a profitable trade)
            if (prices[i] > prices[i - 1]) {
                // Add the profit made from this transaction
                maxProfit += prices[i] - prices[i - 1];
            }

            // Else: we skip this pair because no profit can be made (either same price or drop)
        }

        // After simulating all buy-sell opportunities, return total profit
        return maxProfit;
    }

}
