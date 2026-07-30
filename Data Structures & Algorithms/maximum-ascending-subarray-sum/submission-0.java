class Solution {
    public int maxAscendingSum(int[] nums) {
        int res=nums[0],cursum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                cursum=0;
            }
            cursum+=nums[i];
            res=Math.max(res,cursum);
        }
        return res;
    }
}