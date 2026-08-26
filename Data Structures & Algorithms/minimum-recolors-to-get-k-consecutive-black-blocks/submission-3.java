class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0,r=0;
        int maxlen=blocks.length();
        int wc=0,bc=0;
        while(r<blocks.length())
        {
            if(blocks.charAt(r)=='W')
            {
                wc++;
            }
            else
            {
                bc++;
            }
            if((r-l+1)<k)
                {
                    r++;
                }
            else
            {   
                int currlen=wc;
                maxlen=Math.min(maxlen,currlen);
                if(blocks.charAt(l)=='B') bc--;
                if(blocks.charAt(l)=='W') wc--;
                l++;
                r++;
            }
        }
        return maxlen;
    }
}