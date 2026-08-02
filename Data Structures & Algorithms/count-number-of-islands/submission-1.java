class Solution {
    private boolean[][] visited;
    private int rows;
    private int cols;

    public int numIslands(char[][] grid) {
        rows=grid.length;
        cols=grid[0].length;
        int count=0;
        visited=new boolean[rows][cols];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]=='1'&&!visited[i][j])
                {
                    count+=dfs(i,j,visited,grid);
                }
            }
        } 
        return count;   
    }
    private int dfs(int r,int c,boolean[][] visited,char[][] grid)
    {
        if(r<0||c<0||r>=rows||c>=cols||visited[r][c]||grid[r][c]=='0')
        {
            return 0;
        }

        visited[r][c]=true;
        dfs(r-1,c,visited,grid);
        dfs(r+1,c,visited,grid);
        dfs(r,c-1,visited,grid);
        dfs(r,c+1,visited,grid);
        return 1;
    }
}
