class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]) return 0;
        if(target>nums[nums.length-1]) return nums.length;
        int index=0;
        for(int num:nums)
        {
            if(num<target)
            {
                index++;
            }
            else if(num>+target)
            {
                return index;
            }
        }
        return index;
    }
}