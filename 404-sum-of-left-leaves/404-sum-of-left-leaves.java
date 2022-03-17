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
    public int sumOfLeftLeaves(TreeNode root) {
        
        int[] sum = new int[1];
        helper(root, sum, false);
        
        return sum[0];
        
    }
    
    public void helper(TreeNode root, int[] sum, boolean isLeft) {
        
        if (root == null) return;
        
        if (root.right == null && root.left == null && isLeft) sum[0]+=root.val;
        helper(root.left, sum, true);
        helper(root.right, sum, false);
        
    }
    
}