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
    public boolean isBalanced(TreeNode root) {
        return (dfsHeight(root) != -1);
    }
    
    //the idea is to check whether the tree is balanced or not for that we can find the height if it's not balanced
    //return -1 other wise return the height
    //we can find that by checking whether the abs(Math.max(leftHeight, rightHeight))<1 or not
    
    public int dfsHeight(TreeNode root) {
        if (root == null) return 0;
        int lHeight = dfsHeight(root.left);
        if (lHeight == -1) return -1;
        int rHeight = dfsHeight(root.right);
        if (rHeight == -1) return -1;
        if (Math.abs(lHeight-rHeight)>1) return -1;
        return 1 + Math.max(lHeight, rHeight);
    }
    
}