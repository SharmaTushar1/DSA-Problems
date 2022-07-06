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
        if (root == null) 
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        while (!q.isEmpty()) {
            int qSize = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i<qSize; i++) {
                TreeNode cur = q.poll();
                list.add(cur.val);
                if (cur.left!=null) q.add(cur.left);
                if (cur.right!=null) q.add(cur.right);
            }
            if (count%2==0) 
                ans.add(list);
            else {
                Collections.reverse(list);
                ans.add(list);
            }
            count++;
        }
        return ans;
    }
}