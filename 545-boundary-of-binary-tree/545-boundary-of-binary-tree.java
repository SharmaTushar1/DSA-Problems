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
    public boolean isLeaf(TreeNode root) {
        return root.left==null && root.right==null;
    }
    public void addLeaves(List<Integer> ans, TreeNode root) {
        if (root == null) return;
        if (isLeaf(root)) {
            ans.add(root.val);
        } else {
            addLeaves(ans, root.left);
            addLeaves(ans, root.right);
        }
    }
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (!isLeaf(root))
            ans.add(root.val);
        TreeNode temp = root.left;
        while (temp!=null) {
            if (!isLeaf(temp)) 
                ans.add(temp.val);
            if (temp.left!=null)
                temp = temp.left;
            else 
                temp = temp.right;
        }
        addLeaves(ans, root);
        Stack<Integer> st = new Stack<>();
        temp = root.right;
        while (temp!=null) {
            if (!isLeaf(temp))
                st.add(temp.val);
            if (temp.right!=null)
                temp = temp.right;
            else 
                temp = temp.left;
        }
        while (!st.isEmpty())
            ans.add(st.pop());
        return ans;
    }
}