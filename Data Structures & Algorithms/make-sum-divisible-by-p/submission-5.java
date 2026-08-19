class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum=0;
        for(int num : nums)
        {
            sum+=num;
        }
        if(sum%p==0) return 0;
        int rem=sum%p;
        int len=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int suM=0;
            for(int j=i;j<nums.length;j++)
            {
                suM+=nums[j];
                if(suM%p==rem)
                {
                    len=Math.min(len,j-i+1);
                }
            }
        }
        return len==nums.length?-1:len;
    }
}