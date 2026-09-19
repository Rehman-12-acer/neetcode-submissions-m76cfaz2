class Solution {
    public int numSquares(int n) {
        int [] arr= new int [101];

        for(int i=1;i<=100;i++)
        {
            arr[i]=i*i;
        }
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        return dfs(n,arr,1,dp);
    }
    private int dfs(int n,int[] arr,int i,int [] dp)
    {
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int res=n;
        for(int j=i;j<=100&&arr[j]<=n;j++)
        {
            if(arr[j]<=n)
            {
                res=Math.min(res,1+dfs(n-arr[j],arr,j,dp));
            }
        }
        dp[n]=res;
        return res;
    }
}