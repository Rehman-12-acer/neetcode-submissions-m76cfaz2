class Solution {
    private int [][] grid;
    private boolean [][] visit;
    private int r,c;
    public int islandPerimeter(int[][] grid) {
        this.grid=grid;
        this.r=grid.length;
        this.c=grid[0].length;
        this.visit=new boolean[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1)
                {
                    return dfs(i,j);
                }
            }
        }
        return 0;
    }
    private int dfs(int i,int j)
    {
        if(i<0||i>=r||j<0||j>=c||grid[i][j]==0)
        {
            return 1;
        }
        if(visit[i][j]) return 0;

        visit[i][j]=true;
        return dfs(i+1,j)+dfs(i-1,j)+
                dfs(i,j-1)+dfs(i,j+1);
    }
}