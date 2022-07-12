class Solution {
    public int maxProfit(int[] prices) {
        int cheapestPrice = prices[0];
        int mp = 0;
        
        for (int i = 0; i < prices.length; i++) {
            cheapestPrice = Math.min(cheapestPrice, prices[i]);
            mp = Math.max(mp, prices[i] - cheapestPrice);
        }
        
        return mp;
    }
}