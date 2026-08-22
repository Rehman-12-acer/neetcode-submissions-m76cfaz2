class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        HashMap<Character,Integer> mp= new HashMap<>();
        int st=0;
        for(int i=0;i<s.length();i++)
        {
            char c =s.charAt(i);
            if(mp.containsKey(c))
            {
                st=Math.max(mp.get(c)+1,st);
            }
            mp.put(s.charAt(i),i);
            len=Math.max(len,i-st+1);
        }
        return len;
    }
}
