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
    private TreeNode pre=new TreeNode(0);
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ret=pre;
        inorder(root);
        return ret.right;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        pre.right=root;
        root.left = null;
        pre=root;
        inorder(root.right);
    }
    
}