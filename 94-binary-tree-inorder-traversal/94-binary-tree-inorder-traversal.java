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
        
        //first reach the end of the left part (end means do it till the left node encounters null)
        //keep pushing values to the stack while you're doing this
        //when null is found pop the value from stack and add it to the ans list
        //now change the node to the right of the popped value and repeat the above procedure
        //i.e. first reach the left end then print it.
        
        List<Integer> list = new ArrayList();
        
        if (root == null) return list;
        
        Stack<TreeNode> stack = new Stack();
        
        TreeNode curr = root;
        
        while (curr!=null || !stack.isEmpty()) { //obviously use or not and both should be false
            while (curr!=null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        
        return list;
        
        
        
    }
}