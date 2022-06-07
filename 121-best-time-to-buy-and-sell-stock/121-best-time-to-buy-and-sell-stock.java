class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxP = 0;
        int minsofar=prices[0];
        for (int i = 0; i < n; i++) {
           minsofar=Math.min(prices[i],minsofar);
        maxP=Math.max(maxP,prices[i]-minsofar);
        }     
        return maxP;
    }
}