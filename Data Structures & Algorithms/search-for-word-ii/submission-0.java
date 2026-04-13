public class TrieNode
{
    HashMap<Character,TrieNode> children;
    boolean isEnd;

    public TrieNode()
    {
        children= new HashMap<>();
        isEnd= false;
    }

    public void addword(String word)
    {
        TrieNode current=this;
        for(char c : word.toCharArray())
        {
            current.children.putIfAbsent(c,new TrieNode());
            current=current.children.get(c);
        }
        current.isEnd=true;
    }
}



class Solution {
    private Set<String> res;
    private boolean[][] visit;

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root=new TrieNode();
        for(String word: words)
        {
            root.addword(word);
        }
        int rows=board.length;
        int cols=board[0].length;
        res=new HashSet<>();
        visit=new boolean[rows][cols];

        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                dfs(board,r,c,root,"");
            }
        }
        return new ArrayList<>(res);    
    }
    private void dfs(char[][] board,int r,int c,TrieNode root,String word)
    {
        int rows=board.length,cols=board[0].length;
        if(r<0||c<0||r>=rows||c>=cols||visit[r][c]||
        !root.children.containsKey(board[r][c]))
        {
            return;
        }
        visit[r][c]=true;
        root=root.children.get(board[r][c]);
        word+=board[r][c];
        if(root.isEnd)
        {
            res.add(word);
        }
        dfs(board,r-1,c,root,word);
        dfs(board,r+1,c,root,word);
        dfs(board,r,c-1,root,word);
        dfs(board,r,c+1,root,word);

        visit[r][c]=false;
    }
}
