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
    public boolean findTarget(TreeNode root, int k) {
        //first add all the values in the arraylist and then apply two pointers
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        int start = 0, end = list.size()-1;
        while (start<end) {
            if (list.get(start)+list.get(end)==k) return true;
            else if (list.get(start)+list.get(end)<k) start++;
            else end--;
        }
        return false;
    }
    
    public void dfs(TreeNode root, List<Integer> list) {
        if (root!=null) {
            dfs(root.left, list);
            list.add(root.val);
            dfs(root.right, list);
        }
    }
    
}