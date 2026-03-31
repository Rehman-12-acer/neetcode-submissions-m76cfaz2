class Solution {
    public String minWindow(String s, String t) {
        int [] freq= new int [128];
        for(char c : t.toCharArray())
        {
            freq[c]++;
        }
        int requiredWsize=t.length();
        int l=0,r=0;
        int start=0;
        int minlen=Integer.MAX_VALUE;
        while(r<s.length())
        {
            char rChar=s.charAt(r);
            if(freq[rChar]>0)
            {
                requiredWsize--;
            }
            freq[rChar]--;
            r++;
            while(requiredWsize==0)
            {
                if(r-l<minlen)
                {
                    minlen=r-l;
                    start=l;
                }
                char lChar=s.charAt(l);
                freq[lChar]++;
                if(freq[lChar]>0)
                {
                    requiredWsize++;
                }
                l++;
            }

        }
        return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);
    } 
}
