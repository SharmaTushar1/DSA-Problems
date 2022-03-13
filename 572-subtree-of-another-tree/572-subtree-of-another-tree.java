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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        //I'll keep on traversing the tree and when I'll encounter the value same as subRoot.val
        //I'll start traversing subRoot also for that I'll have to use a new variable not subRoot
        //as possibly these two may be unequal and check if it's equal or not.\
        
        if (subRoot == null) return true;
        if (root == null) return false;
        
        if (sameTree(root,subRoot)) return true;
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);        
    }
    
    public boolean sameTree(TreeNode root, TreeNode subRoot) {
        
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        
        return (root.val == subRoot.val) && sameTree(root.left, subRoot.left) && sameTree(root.right, subRoot.right);
        
    }
    
    
}