/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int totalSum=0;
    public TreeNode convertBST(TreeNode root) {
        totalSum=getsum(root);
        dfs(root);
        return root;
    }
    private int getsum(TreeNode node)
    {
        if(node==null) return 0;
        return node.val+getsum(node.left)+getsum(node.right);
    }
    private void dfs(TreeNode node)
    {
        if(node==null) return;
        dfs(node.left);
        int temp=node.val;
        node.val=totalSum;
        totalSum-=temp;
        dfs(node.right);
    }
}