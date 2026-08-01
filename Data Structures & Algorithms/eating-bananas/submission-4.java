class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int p: piles)
        {
            right=Math.max(right,p);
        }
        int ans=right;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int totalHours=0;
            for(int p: piles)
            {
                totalHours+=Math.ceil((double)p/mid);
            }
            if(totalHours<=h)
            {
                right=mid-1;
                ans=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return ans;
    }
}
