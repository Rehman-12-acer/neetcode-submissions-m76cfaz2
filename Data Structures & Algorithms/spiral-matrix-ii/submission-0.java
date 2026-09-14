class Solution {
    public int[][] generateMatrix(int n) {
        int [][] m= new int [n][n];

        int count=1;
        int left=0,right=n-1,top=0,bottom=n-1;
        int r=0;
        int c=0;
        while(left<=right)
        {
            for(c=left;c<=right;c++)
            {
                m[top][c]=count++;
            }
            top++;

            for(r=top;r<=bottom;r++)
            {
                m[r][right]=count++;
            }
            right--;
            for(c=right;c>=left;c--)
            {
                m[bottom][c]=count++;
            }
            bottom--;
            for(r=bottom;r>=top;r--)
            {
                m[r][left]=count++;
            }
            left++;
        }
        return m;
    }
}