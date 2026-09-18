class Solution {
    public int minCostConnectPoints(int[][] points) {
        HashMap<Integer,List<int []>> mp= new HashMap<>();
        int n= points.length;
        for(int i=0;i<points.length;i++)
        {
            int x=points[i][0];
            int y=points[i][1];
            for(int j=i+1;j<points.length;j++ )
            {
                int x1=points[j][0];
                int y1=points[j][1];

                int d=Math.abs(x-x1)+Math.abs(y-y1);
                mp.computeIfAbsent(i,k->new ArrayList<>()).add(new int[]{d,j});
                mp.computeIfAbsent(j,k->new ArrayList<>()).add(new int[]{d,i});
            }   
        }
        int res=0;
        Set<Integer> visit= new HashSet<>();
        PriorityQueue<int[]> minH=new PriorityQueue<>((a,b)->
        Integer.compare(a[0],b[0]));
        minH.offer(new int[]{0,0});
        while(visit.size()<n)
        {
            int [] curr=minH.poll();
            int cost=curr[0];
            int i=curr[1];
            if(visit.contains(i))
            {
                continue;
            }
            res+=cost;
            visit.add(i);
            for(int [] nei : mp.getOrDefault(i,Collections.emptyList()))
            {
                int neiCost=nei[0];
                int neiIdx=nei[1];
                if(!visit.contains(neiIdx))
                {
                    minH.offer(nei);
                }
            }
        }
        return res;

    }
}
