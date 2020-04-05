package dayFive;

public class BuySellStockII {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int[] dp = new int[prices.length];
        dp[prices.length - 1] = 0;
        for(int i = prices.length -2; i >= 0; i--) {
            dp[i] = prices[i+1] - prices[i];
        }
        int sum = 0;
        for (int value : dp) {
            if (value > 0)
                sum += value;
        }
        return sum;
    }
}
