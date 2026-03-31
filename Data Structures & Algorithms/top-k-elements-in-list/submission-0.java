class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> maxheap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int key:map.keySet())
        {
            maxheap.add(key);
        }
        int [] result=new int [k];
        for(int i=0;i<k;i++)
        {
            result[i]=maxheap.poll();
        }
        return result;


    }
}
