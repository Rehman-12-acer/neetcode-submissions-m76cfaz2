class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int res=0;
        int [] memo= new int [cost.length];
        Arrays.fill(memo,-1);
        return Math.min(dfs(0,cost,res,memo),
        dfs(1,cost,res,memo));
    }
    private int dfs(int i,int []cost,int res,int [] memo)
    {
        if(i>=cost.length)
        {
            return 0;
        }
        if(memo[i]!=-1)
        {
            return memo[i];
        }
        res+=Math.min(cost[i]+dfs(i+1,cost,res,memo),
        cost[i]+dfs(i+2,cost,res,memo));
        memo[i]=res;
        return memo[i];

    }
}
