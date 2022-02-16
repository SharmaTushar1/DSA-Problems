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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ls = new ArrayList<>();
        
        function(root, ls);
        
        return ls;
        
    }
    
    public void function(TreeNode root, ArrayList<Integer> ls) {
        
        if (root == null) return;
        
        ls.add(root.val);
        function(root.left, ls);
        function(root.right, ls);
        
    }
    
}