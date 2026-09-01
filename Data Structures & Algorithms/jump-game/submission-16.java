class Solution {
    public boolean canJump(int[] nums) {
        HashMap<Integer,Boolean> memo = new HashMap<>();

        return dfs(0,nums,memo);            
        
    }
    private boolean dfs(int i,int [] nums,HashMap<Integer,Boolean> memo)
    {
        if(memo.containsKey(i))
        {
            return memo.get(i);
        }

        if(i==nums.length-1)
        {
            return true;
        }
        if(nums[i]==0)
        {
            return false;
        }

        int end=Math.min(nums.length,i+nums[i]+1);
        for(int j=i+1;j<end;j++)
        {
            if(dfs(j,nums,memo))
            {
                memo.put(j,true);
                return true;
            }
        }
        memo.put(i,false);
        return false;
    }
}
