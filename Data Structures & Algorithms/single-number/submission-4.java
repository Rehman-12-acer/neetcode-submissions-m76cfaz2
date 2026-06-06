class Solution {
    public int singleNumber(int[] nums) {
        int n= nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[i]<nums[j])
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        int i=0;
        while(i<n-1)
        {
            if(nums[i]==nums[i+1])
            {
                i+=2;
            }
            else
            {
                return nums[i];
            }
        }
        return nums[i];
        
    }
}
