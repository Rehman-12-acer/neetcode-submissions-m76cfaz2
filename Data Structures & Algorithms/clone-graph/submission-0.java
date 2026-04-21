/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap<Node,Node> oldTonew= new HashMap<>();
        return dfs(node,oldTonew);
    }
    private Node dfs(Node node,HashMap<Node,Node> oldTonew)
    {
        if(node==null)
        {
            return null;
        }
        if(oldTonew.containsKey(node))
        {
            return oldTonew.get(node);
        }
        Node copy=new Node(node.val);
        oldTonew.put(node,copy);
        for(Node nei:node.neighbors)
        {
            copy.neighbors.add(dfs(nei,oldTonew));
        }
        return copy;
    }
}