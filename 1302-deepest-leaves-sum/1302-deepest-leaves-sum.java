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
    public int deepestLeavesSum(TreeNode root) {
        
        if (root == null) return 0;
        
        Queue<TreeNode> q = new LinkedList();
        
        q.offer(root);
        
        int sum = 0;
        
        while (!q.isEmpty()) {
            int qSize = q.size();
            sum = 0;
            for (int i = 0; i<qSize; i++) {
                root = q.poll();
                sum += root.val;
                if (root.left!=null) q.offer(root.left);
                if (root.right!=null) q.offer(root.right);
            }
        }
        
        return sum;
        
    }
    
    public void maxDepth(TreeNode root, int[] maxDepth, int depth) {
        
        if (root == null) return;
        
        maxDepth(root.left, maxDepth, depth+1);
        maxDepth(root.right, maxDepth, depth+1);
        maxDepth[0] = Math.max(maxDepth[0], depth);
        
        
        
    }
    
    public void helper(TreeNode root, int counter, int maxDepth, int sum[]) {
        if (root.left == null && root.right == null && counter == maxDepth) {
            sum[0] += root.val;
            return;
        }
        if (root.left == null && root.right == null) return;
        if (root.left == null) {
            helper(root.right, counter+1, maxDepth, sum);
            return;
        }
        if (root.right == null) {
            helper(root.left, counter+1, maxDepth, sum); 
            return;
        }
        
        helper(root.left, counter+1, maxDepth, sum);
        helper(root.right, counter+1, maxDepth, sum);
    }
    
}