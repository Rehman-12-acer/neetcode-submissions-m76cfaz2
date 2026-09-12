class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0,r=0;
        int sum=0;
        int count=0;
        while(r<arr.length)
        {
            while(r-l+1<=k)
            {
                sum+=arr[r];
                r++;
                if(r-l==k&&sum/k>=threshold)
                {
                    count++;
                }

            }
            sum-=arr[l];
            l++;
        }
        return count;
    }
}