class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
       Map<Integer,List<Integer>> prereq= new HashMap<>();

       for(int [] pair: prerequisites)
       {
            prereq.computeIfAbsent(pair[0],
            k->new ArrayList<>()).add(pair[1]);
       } 
       List<Integer> output= new ArrayList<>();
       Set<Integer> cycle= new HashSet<>();
       Set<Integer> visit= new HashSet<>();

       for(int course=0;course<numCourses;course++)
       {
            if(!dfs(course,prereq,output,cycle,visit))
            {
                return new int[0];
            }
       }
        int [] result= new int [numCourses];
        for(int i=0;i<numCourses;i++)
        {
            result[i]=output.get(i);
        }
        return result;

    }

    private boolean dfs(int course,Map<Integer,List<Integer>> prereq,
        List<Integer> output,Set<Integer> cycle,Set<Integer> visit)
        {
            if(cycle.contains(course))
            {
                return false;
            }
            if(visit.contains(course))
            {
                return true;
            }
            cycle.add(course);
            for(int pre : prereq.getOrDefault(course,
            Collections.emptyList()))
            {
                if(!dfs(pre,prereq,output,cycle,visit))
                {
                    return false;
                }
            }
            cycle.remove(course);
            visit.add(course);
            output.add(course);
            return true;
     }
    
}
