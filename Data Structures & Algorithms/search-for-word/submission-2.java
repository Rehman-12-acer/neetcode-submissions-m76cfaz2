class Solution {
    private int rows;
    private int cols;
    private boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        rows=board.length;
        cols=board[0].length;
        visited=new boolean[rows][cols];

        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                if(backtrack(board,r,c,0,word))
                {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board,int r,int c,int i,String word)
    {
        if(i==word.length())
        {
            return true;
        }
        if(r<0||c<0||r>=rows||c>=cols||
        board[r][c]!=word.charAt(i)||visited[r][c])
        {
            return false;
        }
        visited[r][c]=true;
        boolean res=backtrack(board,r-1,c,i+1,word)||
                    backtrack(board,r+1,c,i+1,word)||
                    backtrack(board,r,c-1,i+1,word)||
                    backtrack(board,r,c+1,i+1,word);
        visited[r][c]=false;
        return res; 
    }
}
