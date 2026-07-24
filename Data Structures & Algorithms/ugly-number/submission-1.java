class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        HashSet<Integer> s= new HashSet<>();
        s.add(2);
        s.add(3);
        s.add(5);
        List<Integer> x= fact(n);
        int m= x.size();
        for(int i=0;i<m;i++)
        {
            int y=x.get(i);
            if(!s.contains(y))
            {
                return false;
            }
        }
        return true;
    }
    private List<Integer> fact(int n)
    {
        List<Integer> x= new ArrayList<>();

        while(n!=1)
        {
            if(n%2==0)
            {
                n/=2;
                x.add(2);
            }
            else if(n%3==0)
            {
                n/=3;
                x.add(3);
            }
            else if(n%5==0)
            {
                n/=5;
                x.add(5);
            }
            else 
            {
                n/=n;
                x.add(n);
            }
        }
        return x;
    }
}