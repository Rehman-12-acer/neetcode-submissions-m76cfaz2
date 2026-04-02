class PrefixTree {
    private PrefixTree[] children;
    private boolean isEnd;
    
    public PrefixTree() {
        children=new PrefixTree[26];
        isEnd=false;     
    }

    public void insert(String word) {
        PrefixTree current=this;
        for(char c : word.toCharArray())
        {
            int index=c-'a';
            if(current.children[index]==null)
            {
                current.children[index]= new PrefixTree();
            }
            current=current.children[index];
        }
        current.isEnd=true;
    }

    public boolean search(String word) {
        PrefixTree current = this;
        for(char c: word.toCharArray())
        {
            int index=c-'a';
            if(current.children[index]==null)
            {
                return false;
            }
            current=current.children[index];
        }
        return current.isEnd;
    }

    public boolean startsWith(String prefix) {
        PrefixTree current = this;
        for(char c : prefix.toCharArray())
        {
            int index=c-'a';
            if(current.children[index]==null)
            {
                return false;
            }
            current=current.children[index];
        }
        return true;
    }
}
