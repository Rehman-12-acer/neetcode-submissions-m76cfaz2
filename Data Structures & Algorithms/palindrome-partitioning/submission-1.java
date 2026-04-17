class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res= new ArrayList<>();
        List<String> cur = new ArrayList<>();
        backtrack(s,res,cur,0);
        return res;
    }
    private void backtrack(String s,List<List<String>> res,
    List<String> cur,int i)
    {
        if(i>=s.length())
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int j=i;j<s.length();j++)
        {
            if(ispali(s,i,j))
            {
                cur.add(s.substring(i,j+1));
                backtrack(s,res,cur,j+1);
                cur.remove(cur.size()-1);
            }
        }
    }
    private boolean ispali(String s, int l, int r)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
