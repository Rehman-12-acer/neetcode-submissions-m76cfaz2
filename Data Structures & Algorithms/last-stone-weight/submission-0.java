class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> weight=new PriorityQueue<>((a,b)->b-a);
        for(int stone: stones)
        {
            weight.offer(stone);
        }
        while(weight.size()>1)
        {
            smasher(weight);
        }
        return weight.peek();
        
    }
    private void smasher(PriorityQueue<Integer> smash)
    {
        int x=smash.poll();
        int y=smash.poll();
        int z=x-y;
        smash.offer(z);
    }
}
