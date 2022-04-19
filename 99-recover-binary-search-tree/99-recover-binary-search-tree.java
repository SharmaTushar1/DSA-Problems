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
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        dfs(cur, list);
        Collections.sort(list);
        int[] arr = new int[]{0};
        compareAndUpdate(root, list, arr);
        
    }
    
    public void dfs(TreeNode cur, ArrayList<Integer> list) {
        if (cur == null) return;
        dfs(cur.left, list);
        list.add(cur.val);
        dfs(cur.right, list);
    }
    
    public void compareAndUpdate(TreeNode root, ArrayList<Integer> list, int[] cur) {
        if (root == null) return;
        compareAndUpdate(root.left, list, cur);
        root.val = list.get(cur[0]);
        cur[0]++;
        compareAndUpdate(root.right, list, cur);
    }
    
    
    
    
    
}