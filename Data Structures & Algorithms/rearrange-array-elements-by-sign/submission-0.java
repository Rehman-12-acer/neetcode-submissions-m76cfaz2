class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] res= new int [nums.length];
        int n=nums.length/2;
        int [] ne= new int [n];
        int [] po= new int [n];
        int i=0,j=0;
        for(int num : nums)
        {
            if(num <0)
            {
                ne[i]=num;
                i++;
            }
            else
            {
                po[j]=num;
                j++;
            }
        }
        int k=0,l=0;
        for(int z=0;z<nums.length;z++)
        {
            if(z%2==0) res[z]=po[k++];
            else
            {
                res[z]=ne[l++];
            }
        }
        return res;
    }
}