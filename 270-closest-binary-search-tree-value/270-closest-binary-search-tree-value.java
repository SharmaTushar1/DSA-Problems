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
    double diff = Integer.MAX_VALUE;
    int ans = 0;
    public int closestValue(TreeNode root, double target) {
        dfs(root, target);
        return ans;
    }
    
    public void dfs(TreeNode root, double k) {
        if (root!=null) {
            if (Math.abs(k-(double)root.val)<diff) {
                diff = Math.abs(k-(double)root.val);
                ans = root.val;
            }
            if (k<root.val) dfs(root.left, k);
            else dfs(root.right, k);
        }
    }
    
} 
