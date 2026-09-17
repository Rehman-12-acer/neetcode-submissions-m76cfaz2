class Solution {
    private HashSet<Integer> s;
    private Map<Integer,List<Integer>> pre;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        pre = new HashMap<>();
        for(int i=0;i<numCourses;i++)
        {
            pre.put(i,new ArrayList<>());
        }
        s=new HashSet<>();
        for(int [] x: prerequisites)
        {
            int a=x[0];
            int b=x[1];
            pre.get(a).add(b);
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
    private boolean dfs(int c)
    {
        if(s.contains(c))
        {
            return false;
        }
        if(pre.get(c).isEmpty())
        {
            return true;
        }
        s.add(c);
        for(int pr : pre.get(c))
        {
            if(!dfs(pr))
            {
                return false;
            }
        }
        s.remove(c);
        pre.put(c,new ArrayList<>());
        return true;
    }
}
