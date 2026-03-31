class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int [] s1count=new int [26];
        int [] windowcount=new int [26];
        for(int i=0;i<s1.length();i++)
        {
            s1count[s1.charAt(i)-'a']++;
        }
        int windowsize=s1.length();
        for(int i=0;i<s2.length();i++)
        {
            windowcount[s2.charAt(i)-'a']++;

            if(i>=windowsize)
            {
                windowcount[s2.charAt(i-windowsize)-'a']--;
            }
            if(matches(s1count,windowcount))
            {
                return true;
            }
        }
        return false;
    }
    private boolean matches(int [] a, int  [] b)
    {
        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i])
            {
                return false;
            }
        }
        return true;
    }
}
