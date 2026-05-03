class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[] rowzero=new boolean[n];
        boolean[] colzero=new boolean[m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    rowzero[i]=true;
                    colzero[j]=true;
                }
            }
        }
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<m;c++)
            {
                if(rowzero[r]||colzero[c])
                {
                    matrix[r][c]=0;
                }
            }
        }

    }
    
}
