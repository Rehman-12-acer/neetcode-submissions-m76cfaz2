class Solution {
    boolean [][] rows;
    boolean [][] cols;
    boolean [][] box;
    public boolean isValidSudoku(char[][] board) {
        rows=new boolean[9][9];
        cols=new boolean[9][9];
        box=new boolean[9][9];

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.') continue;
                int boxId=(i/3)*3+(j/3);
                int num=board[i][j]-'1';
                if(rows[i][num]||cols[num][j]||box[boxId][num])
                {
                    return false;
                }
                rows[i][num]=cols[num][j]=box[boxId][num]=true;
            }

        }
        return true;

        
    }
}
