class Solution {
    public int maxSubArray(int[] nums) {
        int maxsub=nums[0] ,cursum=0;
        for(int num : nums)
        {
            if(cursum<0)
            {
                cursum=0;
            }
            cursum+=num;
            maxsub=Math.max(maxsub,cursum);
        }
        return maxsub;
    }
}
