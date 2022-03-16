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
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        
        int max = root.val;
        
        int count[] = new int[1];
        
        count[0] = 1;
        
        helper(root.left, max, count);
        helper(root.right, max, count);
        
        return count[0];
        
    }
    
    public void helper(TreeNode root, int max, int[] count) {
        
        if (root == null) return;
        
        if (root.val>=max) count[0]++;
        
        max = Math.max(max, root.val);
        
        helper(root.left, max, count);
        helper(root.right, max, count);
        
    }
    
}