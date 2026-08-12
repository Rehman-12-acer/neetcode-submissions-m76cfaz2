class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res= new ArrayList<>();
        char [][] board = new char [n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        backtrack(0,board,res);
        return res;
    }
    private void backtrack(int r,char [][] br,List<List<String>> res)
    {
        if(r==br.length)
        {
            List<String> copy= new ArrayList<>();
            for(char [] row : br)
            {
                copy.add(new String(row));
            }
            res.add(copy);
            return ;
        }
        for(int c=0;c<br.length;c++)
        {
            if(isSafe(r,c,br))
            {
                br[r][c]='Q';
                backtrack(r+1,br,res);
                br[r][c]='.';
            }
        }
        
    }
    private boolean isSafe(int r,int c ,char [][] board)
    {
        for(int i=r-1;i>=0;i--)
        {
            if(board[i][c]=='Q') return false;
        }
        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q') return false;
        }
        for(int i=r-1,j=c+1;i>=0&&j<board.length;i--,j++)
        {
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
}
