class Solution {
    public int minCostConnectPoints(int[][] points) {
        int N=points.length;
        Map<Integer,List<int []>> adj=new HashMap<>();
        int x1=0,x2=0,y1=0,y2=0;
        for(int i=0;i<N;i++)
        {
            x1=points[i][0];
            y1=points[i][1];
            for(int j=i+1;j<N;j++)
            {
                x2=points[j][0];
                y2=points[j][1];
                int dist=Math.abs(x1-x2)+Math.abs(y1-y2);
                adj.computeIfAbsent(i,x->new ArrayList<>()).add(new int []{dist,j});
                adj.computeIfAbsent(j,x->new ArrayList<>()).add(new int []{dist,i});
            }
        }
        int res=0;
        Set<Integer> visit= new HashSet<>();
        PriorityQueue<int[]> minH= new PriorityQueue<>
        (Comparator.comparingInt(a->a[0]));
        minH.offer(new int [] {0,0});
        while(visit.size()<N)
        {
            int [] queue=minH.poll();
            int cost=queue[0];
            int i=queue[1];
            if(visit.contains(i))
            {
                continue;
            }
            res+=cost;
            visit.add(i);
            for(int [] nei:adj.getOrDefault(i,Collections.emptyList()))
            {
                int neiCost=nei[0];
                int neiIndex=nei[1];
                minH.offer(new int [] {neiCost,neiIndex});
            }
        }
        return res;
    }
}
