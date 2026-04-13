public class TrieNode
{
    TrieNode[] children;
    boolean isEnd;

    public TrieNode()
    {
        children=new TrieNode[26];
        isEnd= false;
    }
}



class WordDictionary {
    
    private TrieNode root;

    public WordDictionary() {
        root=new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current=root;

        for(char c : word.toCharArray())
        {
            if(current.children[c-'a']==null)
            {
                current.children[c-'a']= new TrieNode();
            }
            current=current.children[c-'a'];
        }
        current.isEnd=true;
    }

    public boolean search(String word) {
        return dfs(word,0,root);
    }
    private boolean dfs(String word,int j,TrieNode root)
    {
        TrieNode current=root;
        for(int i=j;i<word.length();i++)
        {
            char c =word.charAt(i);
            if(c=='.')
            {
                for(TrieNode node:current.children)
                {
                    if(node!=null&&dfs(word,i+1,node))
                    {
                        return true;
                    }
                }
                return false;
            }
            else
            {
                if(current.children[c-'a']==null)
                {
                    return false;
                }
                current=current.children[c-'a'];
            }
        }
        return current.isEnd;
    }
}
