class Solution {
    public int missingNumber(int[] nums) {
        int [] arr=new int [nums.length+1];
        int xor=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i;        
        }
        for(int num:nums) xor^=num;
        for(int num:arr) xor^=num;
        return xor;
    }
}
