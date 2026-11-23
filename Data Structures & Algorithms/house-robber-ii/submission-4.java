class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int [] memo=new int [nums.length-1];
        int [] arr1=new int [nums.length-1];
        int [] arr2=new int [nums.length-1];
        for(int i=0;i<nums.length-1;i++)
        {
            arr1[i]=nums[i];
        }
        for(int i=1;i<nums.length;i++)
        {
            arr2[i-1]=nums[i];
        }
        Arrays.fill(memo,-1);
        int res1=dfs(arr1,0,memo);
        Arrays.fill(memo,-1);
        int res2=dfs(arr2,0,memo);
        return Math.max(res1,res2);
    }
    private int dfs(int [] nums,int i,int [] memo)
    {
        if(i>=nums.length) return 0;
    
    if(memo[i]!=-1)
    {
        return memo[i];
    }
    return memo[i]=Math.max(dfs(nums,i+1,memo),nums[i]+dfs(nums,i+2,memo));
    }
}
