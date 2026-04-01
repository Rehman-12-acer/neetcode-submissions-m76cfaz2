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
    private int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex=0;
        return helper(preorder,inorder,0,inorder.length-1);
    }
    private TreeNode helper(int [] preorder,int [] inorder,int inleft,int inright)
    {
        if(inleft>inright) return null;
        int rootval=preorder[preIndex++];
        TreeNode root=new TreeNode(rootval);
        int inIndex=inleft;
        while(inIndex<=inright&&inorder[inIndex]!=rootval)
        {
            inIndex++;
        }
        root.left=helper(preorder,inorder,inleft,inIndex-1);
        root.right=helper(preorder,inorder,inIndex+1,inright);
        return root;
    }
}
