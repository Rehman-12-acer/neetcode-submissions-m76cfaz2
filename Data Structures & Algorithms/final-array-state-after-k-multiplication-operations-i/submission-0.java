class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int [] res= new int [nums.length];

        for(int x=0;x<k;x++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<nums.length;j++)
            {
                min=Math.min(min,nums[j]);
            }
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==min)
                {
                    nums[i]*=multiplier;
                    break;
                }
            }
        }
        return nums;
    }
}