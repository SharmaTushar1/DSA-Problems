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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        return dfs(root, low, high);
    }
    
    public TreeNode dfs(TreeNode cur, int low, int high) {
        if (cur == null) return null;
        TreeNode node = new TreeNode();
        if (cur.val<low) node = dfs(cur.right, low, high);
        else if (cur.val>high) node = dfs(cur.left, low, high);
        else {
            node.val = cur.val;
            node.left = dfs(cur.left, low, high);
            node.right = dfs(cur.right, low, high);
        }
        return node;
    }
    
}