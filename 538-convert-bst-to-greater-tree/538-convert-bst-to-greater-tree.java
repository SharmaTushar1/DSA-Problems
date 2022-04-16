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
        int[] arr =  new int[1];
        return helper(root, arr);
    }
    
    public TreeNode helper(TreeNode root, int[] arr) {
        if (root==null) return null;
        helper(root.right, arr);
        arr[0]+=root.val;
        root.val = arr[0];
        helper(root.left, arr);
        return root;
    }
    
}