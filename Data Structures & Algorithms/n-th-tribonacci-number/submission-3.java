class Solution {
    int [] memo;
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        memo=new int [n+1];
        Arrays.fill(memo,-1);
        return dp(n);
    }
    private int dp(int n)
    {
        if(n==0) return 0;
        if(n<=2) return 1;

        if(memo[n]!=-1) return memo[n];

        return memo[n]=dp(n-1)+dp(n-2)+dp(n-3);
      
    }
}