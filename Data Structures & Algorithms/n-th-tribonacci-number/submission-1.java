class Solution {
    public int tribonacci(int n) {
        //calculate for number n-1+n-2+n-3;

        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        int [] dp= new int [n+1];
        Arrays.fill(dp,-1);
        return triban(n,dp);
    }
    private int triban(int n,int [] dp)
    {
        if(n==0||n<0) return 0;
        if(n==2||n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        dp[n]=triban(n-1,dp)+triban(n-2,dp)+triban(n-3,dp);
        return dp[n];
    }
}