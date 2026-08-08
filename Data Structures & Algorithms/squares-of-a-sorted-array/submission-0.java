class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] y= new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            y[i]=nums[i]*nums[i];  
        }
        Arrays.sort(y);
        return y;
    }
}