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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] dia = new int[1];
        height(root, dia);
        return dia[0];
    }
    
    public int height(TreeNode root, int[] dia) {
        if (root == null) return 0;
        int lHeight = height(root.left, dia);
        int rHeight = height(root.right, dia);
        dia[0] = Math.max(dia[0], lHeight+rHeight);
        return 1+Math.max(lHeight, rHeight);
    }
}