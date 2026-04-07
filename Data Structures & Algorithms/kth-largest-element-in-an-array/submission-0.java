class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->b-a);
        int result=0;
        for(int num:  nums)
        {
            pq.offer(num);
        }
        for(int i=0;i<k;i++)
        {
            result=pq.poll();
        }
        return result;
    }
}
