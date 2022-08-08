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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.addLast(root);
        root = root.left;
        while (!stack.isEmpty() || root != null) {
            while (root!=null) {
                stack.addLast(root);
                root = root.left;
            }
            System.out.println("dasf");
            root = stack.pollLast();
            list.add(root.val);
            root = root.right;
        }
        return list;
    }
}