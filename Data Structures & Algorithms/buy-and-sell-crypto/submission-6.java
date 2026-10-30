class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int l=0,r=1;

        while(r<prices.length)
        {
            if(prices[l]<prices[r])
            {
                int max=prices[r]-prices[l];
                profit=Math.max(profit,max);
            }
            else
            {
                l=r;
            }
            r++;
        }
   
        return profit;
    }
}
