class Solution {
    public String minWindow(String s, String t) {
        int [] freq= new int[128];
        for(char c : t.toCharArray())
        {
            freq[c]++;
        }
        int reqsize=t.length();
        int l=0,r=0,start=0;
        int minlen=Integer.MAX_VALUE;
        while(r<s.length())
        {
            char rchar=s.charAt(r);
            if(freq[rchar]>0)
            {
                reqsize--;
            }
            freq[rchar]--;
            r++;
            while(reqsize==0)
            {
                if(r-l<minlen)
                {
                    minlen=r-l;
                    start=l;
                }
                char lchar=s.charAt(l);
                freq[lchar]++;
                if(freq[lchar]>0)
                {
                    reqsize++;
                }
                l++;
            }
        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    }
}
