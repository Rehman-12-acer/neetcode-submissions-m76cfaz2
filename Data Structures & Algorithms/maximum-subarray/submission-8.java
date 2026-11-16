class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<nums.length;i++)
        {
            currsum+=nums[i];
            if(currsum<0)
            {
                sum=Math.max(sum,currsum);
                currsum=0;
                continue;
            }
            sum=Math.max(sum,currsum);
        }
        return sum;
    }
}
