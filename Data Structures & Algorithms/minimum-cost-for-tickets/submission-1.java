class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int [] dp= new int [days.length];
        Arrays.fill(dp,-1);
        return dfs(0,days.length,days,costs,dp);
    }
    private int dfs(int i,int n,int [] days,int [] costs,int [] dp)
    {
        if(i==n)  return 0;
        if(dp[i]!=-1) return dp[i];
        dp[i]=costs[0]+dfs(i+1,n,days,costs,dp);
        int j=i;
        while(j<n&&days[j]<days[i]+7)
        {
            j++;
        }
        dp[i]=Math.min(dp[i],costs[1]+dfs(j,n,days,costs,dp));
        j=i;
        while(j<n&&days[j]<days[i]+30)
        {
            j++;
        }
        dp[i]=Math.min(dp[i],costs[2]+dfs(j,n,days,costs,dp));
        return dp[i];
    }
}