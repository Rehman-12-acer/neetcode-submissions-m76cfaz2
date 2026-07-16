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
    private TreeNode helper(int [] pre,int [] inor,int inL,int inR)
    {
        if(inL>inR) return null;
        int val=pre[preIndex++];
        TreeNode root=new TreeNode(val);
        int inIndex=inL;
        while(inIndex<=inR&&inor[inIndex]!=val)
        {
            inIndex++;
        }
        root.left=helper(pre,inor,inL,inIndex-1);
        root.right=helper(pre,inor,inIndex+1,inR);
        return root;
    }

}
