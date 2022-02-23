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
    public int maxPathSum(TreeNode root) {
      int[] arr = new int[1];
      arr[0] = Integer.MIN_VALUE;
      sumFinder(root, arr);
      return arr[0];
    }
    
    public int sumFinder(TreeNode root, int[] arr) {
      
      if (root == null) return 0;
      int leftSum = Math.max(0, sumFinder(root.left, arr));
      int rightSum = Math.max(0, sumFinder(root.right, arr));
      
      arr[0] = Math.max(arr[0], root.val+leftSum+rightSum);
      
      // int val = ;
      
      return root.val+Math.max(leftSum,rightSum);
      
    }
  
}