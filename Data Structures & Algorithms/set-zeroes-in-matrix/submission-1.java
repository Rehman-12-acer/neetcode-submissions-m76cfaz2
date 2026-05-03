class Solution {
    boolean[][] mat;
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        mat= new boolean[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    setting(matrix,mat,i,j);
                }
            }
        }

        for(int r=0;r<n;r++)
        {
            for(int c=0;c<m;c++)
            {
                if(mat[r][c])
                {
                    matrix[r][c]=0;
                }
            }
        }

    }
    private void setting(int[][] matrix,boolean[][] mat,
    int r, int c)
    {
        int row=r,col=c;
        for(int i=0;i<matrix.length;i++)
        {
            mat[i][col]=true;
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            mat[row][i]=true;
        }
    
    }
}
