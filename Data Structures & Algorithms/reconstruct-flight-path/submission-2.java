class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String,PriorityQueue<String>> adj= new HashMap<>();
        for(List<String> str:tickets)
        {
            String src=str.get(0);
            String dst=str.get(1);
             
            adj.computeIfAbsent(src,x->new PriorityQueue<>()).offer(dst);
        }
        List<String> res= new ArrayList<>();
        dfs(adj,res,"JFK");
        Collections.reverse(res);
        return res;
    }
    private void dfs(Map<String,PriorityQueue<String>> adj,List<String> res,String src)
    {
        PriorityQueue<String> queue=adj.get(src);
        while(queue!=null&&!queue.isEmpty())
        {
            String dst=queue.poll();
            dfs(adj,res,dst);
        }
        res.add(src);
    }
}
