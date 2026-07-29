class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s= new HashSet<>();
        while(!s.contains(n))
        {
            s.add(n);
            n=sumofsquares(n);
            if(n==1)
            {
                return true;
            }
        }
        return false;
    }
    private int sumofsquares(int n)
    {
        int output=0;
        while(n>0)
        {
            int digit=n%10;
            digit=digit*digit;
            output+=digit;
            n/=10;
        }
        return output;
    }
}
