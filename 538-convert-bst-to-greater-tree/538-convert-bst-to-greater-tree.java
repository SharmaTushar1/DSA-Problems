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
    
    public TreeNode convertBST(TreeNode root) {
        helper(root, new int[1]);
        return root;
    }
    
    public void helper(TreeNode root, int[] value) {
        if (root == null) return;
        helper(root.right, value);
        root.val += value[0];
        value[0] = root.val;
        helper(root.left, value);
    }
    
}