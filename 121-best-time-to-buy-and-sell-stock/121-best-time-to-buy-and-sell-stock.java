class Solution {
    public int maxProfit(int[] prices) {
        int mp = 0;
        int lp = Integer.MAX_VALUE;
        
        for (int price : prices) {
            lp = Math.min(lp, price);
            mp = Math.max(mp, price - lp);
        }
        
        return mp;
    }
}