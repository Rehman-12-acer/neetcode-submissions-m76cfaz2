class Solution {
    private Map<Integer,List<Integer>> premap=new HashMap<>();
    private Set<Integer> visiting=new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++)
        {
            premap.put(i,new ArrayList<>());
        }    
        for(int [] prereq:prerequisites)
        {
            premap.get(prereq[0]).add(prereq[1]);
        }

        for(int c=0;c<numCourses;c++)
        {
            if(!dfs(c))
            {
                return false;
            }
        }
        return true;
    }
    private boolean dfs(int crs)
    {
        if(visiting.contains(crs))
        {
            return false;
        }
        if(premap.get(crs).isEmpty())
        {
            return true;
        }
        visiting.add(crs);
        for(int pre:premap.get(crs))
        {
            if(!dfs(pre))
            {
                return false;
            }
        }
        visiting.remove(crs);
        premap.put(crs,new ArrayList<>());
        return true;
    }
}
