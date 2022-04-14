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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) return list;
        bfs(list, root);
        return list;
    }
    
    public void bfs(List<Integer> list, TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            TreeNode cur = q.poll();
            boolean visited = false;
            for (int i = 0; i<levelSize; i++) {
                if (!visited) {
                    visited = true;
                    list.add(cur.val);
                    if (cur.right!=null) q.offer(cur.right);
                    if (cur.left!=null) q.offer(cur.left);
                } else {
                    cur = q.poll();
                    if (cur.right!=null) q.offer(cur.right);
                    if (cur.left!=null) q.offer(cur.left);
                }
            }
        }
    }
    
}