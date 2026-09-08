class Solution {
    private int res=0;
    public int combinationSum4(int[] nums, int target) {
        /*
        dfs(0,target)
        target==0 return 1
        way++;
        dfs(i+1,)
        if(target<0) return 0;
        i+;
        [3,1,2] single decision each time incrementing the previous one 
        3+3<tr<0 so i++;


        */
        int sum=0;
        for(int num : nums)
        {
            sum +=num;
        }

        Arrays.sort(nums);
        int [] dp = new int [target+1];
        Arrays.fill(dp,-1);
        return dfs(nums,target,dp);

    }
    private int dfs(int [] nums,int target,int [] dp)
    {
        if(target==0) return 1;
        res=0;
        if(dp[target]!=-1)
        {
            return dp[target];
        }
        for(int num : nums)
        {
            if(target< num)
            {
                break;
            }
            res+=dfs(nums,target-num,dp);
        }
        dp[target]=res;
        return res;
    }
}