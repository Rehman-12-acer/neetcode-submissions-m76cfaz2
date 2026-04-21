class Solution {
    private int [][] directions={{1,0},{-1,0,},
                                {0,1},{0,-1}};
    private int INF=2147483647;
    private int rows,cols;
    public void islandsAndTreasure(int[][] grid) {
        rows=grid.length;
        cols=grid[0].length;

        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                if(grid[r][c]==INF)
                {
                    grid[r][c]=bfs(grid,r,c);
                }
            }
        }
    }
    private int bfs(int [][] grid,int r,int c)
    {
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{r,c});
        boolean[][] visit=new boolean[rows][cols];
        visit[r][c]=true;
        int steps=0;

        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int [] curr=q.poll();
                int row=curr[0];
                int col=curr[1];
                if(grid[row][col]==0) return steps;
                for(int[] dir : directions)
                {
                    int nr=row+dir[0],nc=col+dir[1];
                    if(nr>=0&&nc>=0&&nr<rows&&nc<cols&&
                    !visit[nr][nc]&&grid[nr][nc]!=-1)
                    {
                        visit[nr][nc]=true;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            steps++;
        }
        return INF;
    }
}
