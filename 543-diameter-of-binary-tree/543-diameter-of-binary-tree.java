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
    int[] diameter = new int[1];
    diameterFinder(root, diameter);
    return diameter[0];
  }
  
  public int diameterFinder(TreeNode root, int[] diameter) {
    if (root == null) return 0;
    
    int lHeight = diameterFinder(root.left, diameter);
    int rHeight = diameterFinder(root.right, diameter);
    
    diameter[0] = Math.max(diameter[0], lHeight+rHeight);
    
    return 1+Math.max(lHeight,rHeight);
  }
  
}