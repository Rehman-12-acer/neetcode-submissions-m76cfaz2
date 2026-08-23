class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int maxarea=0;
        while(l<r)
        {
            int len=r-l;
            int b=0;
            if(heights[l]<heights[r])
            {
                b=heights[l];
                l++;
            }
            else
            {
                b=heights[r];
                r--;
            }
            int currarea=len*b;
            maxarea=Math.max(maxarea,currarea);
        }
        return maxarea;
    }
}
