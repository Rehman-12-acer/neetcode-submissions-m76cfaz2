class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int diff=nums.length-k;
        int [] res=new int [diff+1];
        PriorityQueue<int []> heap= new PriorityQueue<>((a,b)->b[0]-a[0]);
        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
            heap.offer(new int []{nums[i],i});
            if(i>=k-1)
            {
                while(heap.peek()[1]<=i-k)
                //Is the maximum element currently from an old window?
                {
                    heap.poll();
                }
                res[idx++]=heap.peek()[0];
            }

        }
        return res;
    }
}
