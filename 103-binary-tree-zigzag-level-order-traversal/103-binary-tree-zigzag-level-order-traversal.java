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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Deque<TreeNode> q = new LinkedList<>();
        q.addFirst(root);
        int count = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i<size; i++) {
                    TreeNode node = q.removeLast();
                    list.add(node.val);
                    if (node.left!=null) q.addFirst(node.left);
                    if (node.right!=null) q.addFirst(node.right);
            }
            if (count%2==0) {
                ans.add(list);
            } else {
                Collections.reverse(list);
                ans.add(list);
            }
            count++;
        }
        return ans;
    }
}