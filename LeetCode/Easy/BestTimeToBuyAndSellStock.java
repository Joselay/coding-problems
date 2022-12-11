class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0)
            return 0;
        int minP = prices[0];
        int maxPf =0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < minP)
                minP = prices[i];
            else
                maxPf = Math.max(maxPf,prices[i]-minP);
        }
        return maxPf;
    }
}
