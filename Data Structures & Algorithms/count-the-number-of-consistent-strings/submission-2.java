class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> s= new HashSet<>();

        for(char c : allowed.toCharArray())
        {
            s.add(c);
        }
        int count =0;
        for(String wrd: words)
        {
            boolean f =false;
            for(char c : wrd.toCharArray())
            {
                f=contains(c,s);
                if(f==false) break;
            }
            if(f)
            {
                count++;
            }
        }
        return count;
    }
    private boolean contains(char c ,HashSet<Character> s)
    {
        if(s.contains(c)) return true;
        return false;
    }
}