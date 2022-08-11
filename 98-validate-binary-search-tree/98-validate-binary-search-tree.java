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
    public boolean isValidBST(TreeNode root) {
        return isValid(Long.MIN_VALUE, Long.MAX_VALUE, root);
    }
    
    public boolean isValid(long lowerLimit, long upperLimit, TreeNode root) {
        if (root==null) return true;
        if (lowerLimit<root.val && upperLimit>root.val) {
            return isValid(lowerLimit, root.val, root.left) && isValid(root.val, upperLimit, root.right);
        } 
        return false;
    }
}