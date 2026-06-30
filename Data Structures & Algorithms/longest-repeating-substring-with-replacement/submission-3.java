class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map= new HashMap<>();
        int maxf=0,l=0,r=0;
        int maxlen=0;
        for(r=0;r<s.length();r++)
        {
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,map.get(s.charAt(r)));
            while(r-l+1-maxf>k)
            {
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}
