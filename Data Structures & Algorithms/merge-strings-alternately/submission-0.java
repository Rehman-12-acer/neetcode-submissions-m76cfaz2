class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res= new StringBuilder();
        int p1=0,p2=0;
        while(p1<word1.length()&&p2<word2.length())
        {
            res.append(word1.charAt(p1));
            res.append(word2.charAt(p2));
            p1++;
            p2++;
        }
        if(p1<word1.length())
        {
            res.append(word1.substring(p1));
        }
        if(p2<word2.length())
        {
            res.append(word2.substring(p2));
        }
        return res.toString();
    }
}