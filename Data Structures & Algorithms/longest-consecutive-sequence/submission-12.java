class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int n=nums.length;
        int res=1;
        int streak=1;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1]) continue;
            else if(nums[i]-1==nums[i-1])
            {
                streak++;
                res=Math.max(res,streak);
            }
            else
            {
                streak=1;
            }
        }
        return res;
    
    }
}
