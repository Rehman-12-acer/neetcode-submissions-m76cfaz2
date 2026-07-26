class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int dec=1,inc=1,res=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                inc++;
                dec=1;
            }
            else if(nums[i-1]>nums[i])
            {
                dec++;
                inc=1;
            }
            else
            {
                inc=dec=1;
            }
            res=Math.max(res,Math.max(inc,dec));
        }
        return res;
    }
}