class Solution {
    public String minWindow(String s, String t) {
        int [] freq= new int [128];
        for(char c : t.toCharArray())
        {
            freq[c]++;
        }
        int minlen=s.length()+1;
        int l=0,r=0;
        int required=0;
        int start=0;
        while(r<s.length())
        {
            char c =s.charAt(r);
            freq[c]--;
            if(freq[c]>=0)
            {
                required++;
            }
            r++;
            while(required==t.length())
            {
                if(r-l<minlen)
                {
                    minlen=r-l;
                    start=l;
                }
                char ch=s.charAt(l);
                freq[ch]++;
                if(freq[ch]>0)
                {
                    required--;
                }
                l++;
            }
        }
        return minlen==s.length()+1?"":s.substring(start,start+minlen);
    }
}
