class Solution {
    boolean[][] visited;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int pix=image[sr][sc];
        visited=new boolean[m][n];
        boolean[][] fill= new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                visited=new boolean[m][n];
                if(image[i][j]==pix&&dfs(i,j,image,sr,sc))
                {
                    fill[i][j]=true;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(fill[i][j])
                {
                    image[i][j]= color;
                }
            }
        }
        return image;
    }
    private boolean dfs(int r,int c ,int [][] image,int sr,int sc)
    {
        if(r>=image.length||r<0||c<0||c>=image[0].length||
        image[r][c]!=image[sr][sc]||visited[r][c])
        {
            return false;
        }
        visited[r][c]=true;
        if(r==sr&&c==sc) return true;
        boolean bool=dfs(r+1,c,image,sr,sc)||
                      dfs(r-1,c,image,sr,sc)||
                      dfs(r,c+1,image,sr,sc)||
                      dfs(r,c-1,image,sr,sc);
        return bool;
    }
}