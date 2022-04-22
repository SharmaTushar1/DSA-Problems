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
        return height(root)!=-1;
    }
    
    public int height(TreeNode root) {
        if (root == null) return 0;
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        if (Math.abs(lHeight-rHeight)>1 || lHeight == -1 || rHeight == -1) return -1;
        return 1+Math.max(lHeight, rHeight);
    }
    
}