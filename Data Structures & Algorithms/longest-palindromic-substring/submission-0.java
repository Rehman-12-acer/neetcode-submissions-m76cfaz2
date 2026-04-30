class Solution {
    public String longestPalindrome(String s) {
        int reslen=0,residx=0;

        for(int i=0;i<s.length();i++)
        {
            int l=i,r=i;

            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>reslen)
                {
                    reslen=r-l+1;
                    residx=l;
                }
                l--;
                r++;
            }
            l=i;r=i+1;
            while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>reslen)
                {
                    reslen=r-l+1;
                    residx=l;
                }
                l--;
                r++;
            }
        }
        return s.substring(residx,residx+reslen);
    }
}
