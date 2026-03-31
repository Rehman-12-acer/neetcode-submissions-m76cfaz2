class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int area=0;
        int length=0;
        int breadth=0;
        while(l<r)
        {
            length=r-l;

            if(heights[l]<heights[r])
            {
                breadth=heights[l];
                l++;
            }
            else
            {
                breadth=heights[r];
                r--;
            }
            int currArea=length*breadth;
            area=Math.max(currArea,area);
        }
        return area;
    }
}
