class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int []> pq= new PriorityQueue
        <>((a,b)->Integer.compare(b[0],a[0]));
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int num: nums)
        {
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            pq.offer(new int []{entry.getValue(),entry.getKey()});
        }
        int[] res=new int [k];
        for(int i=0;i<k;i++)
        {
            int [] val=new int[2];
            val=pq.poll();
            res[i]=val[1];
        }
        return res;
    }

}
