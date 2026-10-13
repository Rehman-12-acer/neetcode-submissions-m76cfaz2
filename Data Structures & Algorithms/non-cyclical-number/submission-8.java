class Solution {
    public boolean isHappy(int n) {
        int x=n;
        HashSet<Integer> s= new HashSet<>();
        while(x!=1)
        {
            if(s.contains(x)) return false;
            s.add(x);
            int sum=0;
            while(x>0)
            {
                int digit=x%10;
                sum+=digit*digit;
                x/=10;
            }
            x=sum;
        }
        return true;
    }
}
