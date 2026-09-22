class Solution {
    public int arrangeCoins(int n) {
        int x=n;
        int res=0;
        for(int i=1;i<=n;i++)
        {
            x-=i;
            res++;
            if(x<0)
            {
                res--;
                break;
            }
        }
        return res;
    }
}