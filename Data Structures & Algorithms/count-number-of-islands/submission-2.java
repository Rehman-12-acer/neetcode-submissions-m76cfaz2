class Solution {
    private char [][] grid;
    private int r,c;
    public int numIslands(char[][] grid) {
        this.grid=grid;
        this.r=grid.length;
        this.c=grid[0].length;
        int islands=0;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(i,j);
                    islands++;
                }
            }
        }
        return islands;
    }
    private void dfs(int i,int j)
    {
        if(i<0||j<0||i>=r||j>=c||grid[i][j]=='0')
        {
            return;
        }
        grid[i][j]='0';
        dfs(i+1,j);
        dfs(i-1,j);
        dfs(i,j+1);
        dfs(i,j-1);
    }

}
