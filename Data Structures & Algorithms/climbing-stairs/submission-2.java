class Solution {
    private int [] memo;
    public int climbStairs(int n) {
        if(n<=2) return n;
        memo=new int [n];
        Arrays.fill(memo,-1);
        return dp(n,0);
    }
    private int dp(int n,int i)
    {
        if(i>=n) return i==n?1:0;
        if(memo[i]!=-1) return memo[i];
        return memo[i]=dp(n,i+1)+dp(n,i+2);
    }
}
