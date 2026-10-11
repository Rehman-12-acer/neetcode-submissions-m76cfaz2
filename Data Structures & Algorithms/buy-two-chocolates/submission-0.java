class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int leftover=money;
        for(int i=0;i<2;i++)
        {
            leftover-=prices[i];
        }
        return leftover>=0?leftover:money;
    }
}