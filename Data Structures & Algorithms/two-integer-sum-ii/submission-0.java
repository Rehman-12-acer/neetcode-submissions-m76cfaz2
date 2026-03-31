class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<r)
        {
            int Cursum=numbers[l]+numbers[r];
            if(Cursum>target)
            {
                r--;
            }
            else if(Cursum<target)
            {
                l++;
            }
            else
            {
                return new int []{l+1,r+1};
            }
        }
        return new int [] {};

    }
}
