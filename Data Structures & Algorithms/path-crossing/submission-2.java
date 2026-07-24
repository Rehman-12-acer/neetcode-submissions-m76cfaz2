class Solution {
    public boolean isPathCrossing(String path) {
        int x=0,y=0;
        Set<String> s= new HashSet<>();
        s.add(0+","+0);
        for(char c : path.toCharArray())
        {
            if(c=='E') x++;
            else if(c=='W') x--;
            else if(c=='N') y++;
            else if(c=='S') y--;
            String pos= x+","+y;
            if(s.contains(pos))
            {
                return true;
            }
            s.add(pos); 
        }
        return false;
    }
}