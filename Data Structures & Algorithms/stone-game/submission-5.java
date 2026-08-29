class Solution {
    public boolean stoneGame(int[] piles) {
        int total=0;

        for(int pile : piles)
        {
            total+=pile;
        }
        int [][] memo= new int [piles.length][piles.length];

        for(int i=0;i<piles.length;i++)
        {
            Arrays.fill(memo[i],-1);
        }
        int alicescore=dfs(0,piles.length-1,piles,memo);
        return alicescore>total-alicescore;
    }
    private int dfs(int l,int r,int [] piles,int [][] memo)
    {
        if(l>r)
        {
            return 0;
        }
        if(memo[l][r]!=-1)
        {
            return memo[l][r];
        }
        boolean even =(r-l+1)%2==0;
        int left=even?piles[l]:0;
        int right=even?piles[r]:0;
        memo[l][r]=Math.max(dfs(l+1,r,piles,memo)+left,dfs(l,r-1,piles,memo)+right);
        return memo[l][r];
    }
}