class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int l=0;
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        HashSet<Character> st= new HashSet<>();
        for(int r=0;r<s.length();r++)
        {
            while(st.contains(s.charAt(r)))
            {
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            res=Math.max(res,r-l+1);
        }
        return res;
    }
}
