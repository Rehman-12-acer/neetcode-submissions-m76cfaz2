class Solution {
    public int maxArea(int[] heights) {
        int res=0;
        int l=0,r=heights.length-1;
        while(l<r)
        {
            int br,le,ar;
            br=le=ar=0;
            if(heights[l]<=heights[r])
            {
                br=heights[l];
                l++;
            }
            else
            {
                br=heights[r];
                r--;
            }
            le=r-l+1;
            ar=le*br;
            res=Math.max(res,ar);
        }
        return res;
    }
}
