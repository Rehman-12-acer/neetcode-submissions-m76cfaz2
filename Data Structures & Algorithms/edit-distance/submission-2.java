class Solution {
    int [][] memo;
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();

        memo= new int [m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(memo[i],-1);
        }
        return dfs(word1,word2,0,0,m,n) ;
    }
    private int dfs(String s,String t,int i,int j,int m,int n)
    {
        if(i==m) return n-j;
        if(j==n) return m-i;

        if(memo[i][j]!=-1)
        {
            return memo[i][j];
        }

        if(s.charAt(i)==t.charAt(j))
        {
            return dfs(s,t,i+1,j+1,m,n);
        }
        int res=Math.min(dfs(s,t,i+1,j,m,n),dfs(s,t,i,j+1,m,n));

        res=Math.min(dfs(s,t,i+1,j+1,m,n),res);
        memo[i][j]=res+1;
        return memo[i][j];
    }
}
