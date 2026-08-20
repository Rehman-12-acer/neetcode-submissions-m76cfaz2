class Solution {
    public String maximumOddBinaryNumber(String s) {
        int l=s.length();
        int count =0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
        }
        char [] c=s.toCharArray();
        for(int i=0;i<l;i++)
        {
            int a=c[i]-'0';
            a=a&1;
            c[i]=(char)(a+'0');
        }
        return "1".repeat(count-1)+"0".repeat(l-count)+"1";
    }
}