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
        //set the upper value for right and left while traversing
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean valid(TreeNode root, long lValue, long uValue) {
        if (root == null) {
            return true;
        } 
        if (root.val<uValue && root.val>lValue) {
            //when I'm going left the lValue will remain same but rValue will be root.value and vice versa
            return valid(root.left, lValue, root.val) && valid(root.right, root.val, uValue);
        }
        return false;
    }
    
}