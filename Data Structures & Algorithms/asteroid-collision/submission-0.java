class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk= new Stack<>();

        for(int a : asteroids)
        {
            while(!stk.isEmpty()&&a<0&&stk.peek()>0)
            {
                int diff=a+stk.peek();
                if(diff<0)
                {
                    stk.pop();
                }
                else if(diff>0)
                {
                    a=0;
                }
                else
                {
                    a=0;
                    stk.pop();
                }
            }
            if(a!=0)
            {
                stk.add(a);
            }
        }
        int n=stk.size();
        int [] x= new int [n];
        for(int i=n-1;i>=0;i--)
        {
            x[i]=stk.pop();
        }
        return x;
    }
}