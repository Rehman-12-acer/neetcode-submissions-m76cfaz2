class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num : nums)
        {
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer>pq= 
            new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));

        for(int key : mp.keySet())
        {
            pq.offer(key);
        }

        int [] result= new int [k];

        for(int i=0;i<k;i++)
        {
            result[i]=pq.poll();
        }
        return result;
    }
}
