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
    public int kthSmallest(TreeNode root, int k) {
        //We will need a stack
        Deque<TreeNode> stack = new LinkedList<>();
        while (true) {
            //go to the left most as it is the smallest
            while (root!=null) {
                stack.addLast(root);
                root = root.left;
            }
            root = stack.pollLast();
            if (--k==0) return root.val;
            root = root.right;//the root is not the kth smallest so look on the right
        }
    }
}