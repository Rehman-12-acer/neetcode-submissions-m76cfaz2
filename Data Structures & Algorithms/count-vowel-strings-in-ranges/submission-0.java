class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] res= new int [queries.length];

        for(int i=0;i<queries.length;i++)
        {
            int x=queries[i][0];
            int y=queries[i][1];
            for(int j=x;j<=y;j++)
            {
                String xx=words[j];
                if(isValid(xx))
                {
                    res[i]++;
                }
            }
        }
        return res;
    }
    private boolean isValid(String w)
    {
        HashSet<Character> s= new HashSet<>();
        s.add('a');
        s.add('e');
        s.add('i');
        s.add('o');
        s.add('u');
        char c = w.charAt(0);
        char cc=w.charAt(w.length()-1);

        if(s.contains(c)&&s.contains(cc))
        {
            return true;
        }
        return false;
    }
}