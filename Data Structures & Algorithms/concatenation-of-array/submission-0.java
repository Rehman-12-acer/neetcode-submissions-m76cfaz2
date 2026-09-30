class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int m=2*n;
        int [] ar= new int [m];
        for(int i=0;i<n;i++)
        {
            ar[i]=nums[i];
        }
        for(int i=n;i<m;i++)
        {
            ar[i]=nums[i-n];
        }
        return ar;
    }
}