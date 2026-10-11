class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->b-a);

        for(int a : nums)
        {
            pq.offer(a);
        }
        int key=0;
        for(int i=0;i<k;i++)
        {
            key=pq.poll();
        }
        return key;
    }
}
