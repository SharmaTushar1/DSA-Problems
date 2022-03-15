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
    public int deepestLeavesSum(TreeNode root) {
        
        
        
        int[] maxDepth = new int[1];
        
        maxDepth(root, maxDepth, 0);
        
        int[] sum = new int[1];
        
        helper(root, 0, maxDepth[0], sum);
        
        return sum[0];
        
    }
    
    public void maxDepth(TreeNode root, int[] maxDepth, int depth) {
        
        if (root == null) return;
        
        maxDepth(root.left, maxDepth, depth+1);
        maxDepth(root.right, maxDepth, depth+1);
        maxDepth[0] = Math.max(maxDepth[0], depth);
        
        
        
    }
    
    public void helper(TreeNode root, int counter, int maxDepth, int sum[]) {
        if (root.left == null && root.right == null && counter == maxDepth) {
            sum[0] += root.val;
            return;
        }
        if (root.left == null && root.right == null) return;
        if (root.left == null) {
            helper(root.right, counter+1, maxDepth, sum);
            return;
        }
        if (root.right == null) {
            helper(root.left, counter+1, maxDepth, sum); 
            return;
        }
        
        helper(root.left, counter+1, maxDepth, sum);
        helper(root.right, counter+1, maxDepth, sum);
    }
    
}