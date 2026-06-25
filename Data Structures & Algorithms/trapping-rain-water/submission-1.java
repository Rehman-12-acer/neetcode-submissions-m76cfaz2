class Solution {
    public int trap(int[] height) {
        int leftmax=0,rightmax=0;
        int area=0;
        int l=0,r=height.length-1;
        while(l<r)
        {
            if(height[l]<=height[r])
            {
                if(height[l]>=leftmax)
                {
                    leftmax=height[l];
                }
                else
                {
                    area+=leftmax-height[l];
                }
                l++;
            }
            else
            {
                if(height[r]>=rightmax)
                {
                    rightmax=height[r];
                }
                else
                {
                    area+=rightmax-height[r];
                }
                r--;
            }
        }
        return area;
    }
}
