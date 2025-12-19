class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuy = prices[0];
        for(int sell : prices){
            minBuy = Math.min(sell,minBuy);
            maxProfit = Math.max(maxProfit,sell-minBuy);
        }
        return maxProfit;
    }
}