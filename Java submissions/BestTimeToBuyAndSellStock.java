class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            int profit = price - buyPrice;
            if (profit < 0) {
                buyPrice = price;
            }
            else {
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}