class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int minCost = prices[0];

        for(int i =1; i<prices.length; i++){
    
            if (prices[i] < minCost) {
                minCost= prices[i];
            }
                maxProfit = Math.max(maxProfit, prices[i] - minCost);
            
        }
        return maxProfit;
}
}
