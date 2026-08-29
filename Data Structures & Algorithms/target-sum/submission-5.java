class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int num : nums)
        {
            sum+=num;
        }
        int [][] memo= new int [nums.length][2*sum+1];
        for(int i=0;i<nums.length;i++)
        {
            Arrays.fill(memo[i],-1);
        }
        return backtrack(0,0,nums,target,memo,sum);
    }
    private int backtrack(int i,int total,int [] nums, int target,
    int [][] memo,int offset)
    {
        if(i==nums.length)
        {
            return total==target?1:0;
        }
        int index=offset+total;
        if(memo[i][index]!=-1)
        {
            return memo[i][index];
        }

        int add=backtrack(i+1,total+nums[i],nums,target,memo,offset);
        int sub=backtrack(i+1,total-nums[i],nums,target,memo,offset);

        memo[i][index]=add+sub;
        return memo[i][index];
    }
}
