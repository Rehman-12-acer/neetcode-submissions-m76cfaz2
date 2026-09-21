class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s= new StringBuilder();
        int carry=0;
        StringBuilder sa= new StringBuilder(a).reverse();
        StringBuilder sb= new StringBuilder(b).reverse();
        for(int i=0;i<Math.max(a.length(),b.length());i++)
        {
            int digita=i<sa.length()?sa.charAt(i)-'0':0;
            int digitb=i<sb.length()?sb.charAt(i)-'0':0;

            int total=digita+digitb+carry;
            char c= (char)((total%2)+'0');
            s.append(c);
            carry=total/2;
        }
        if(carry>0)
        {
            s.append('1');
        }
        return s.reverse().toString();
    }
}