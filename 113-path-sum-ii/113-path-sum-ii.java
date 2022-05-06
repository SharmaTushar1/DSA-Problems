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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, targetSum, new ArrayList<Integer>(), ans);
        return ans;
    }
    
    public void helper(TreeNode root, int targetSum, List<Integer> list, List<List<Integer>> ans) {
        if (root == null) return;
        list.add(root.val);
        if (targetSum == root.val && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(list));
            // return;
        }
        helper(root.left, targetSum-root.val, list, ans);
        helper(root.right, targetSum-root.val, list, ans);
        list.remove(list.size()-1);
    }
    
}