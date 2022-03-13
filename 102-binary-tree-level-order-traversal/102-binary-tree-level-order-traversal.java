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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        if (root == null) return list;
        
        Queue<TreeNode> q = new LinkedList();
        
        q.offer(root);
        
        while (!q.isEmpty()) {
            
            int levelNum = q.size();
            List<Integer> subList = new ArrayList();
            
            for (int i = 0; i<levelNum; i++) {
                root = q.poll();
                subList.add(root.val); 
                if (root.left != null) q.offer(root.left);
                if (root.right != null) q.offer(root.right);
            }
            list.add(subList);
           
        }
        
        return list;
        
    }
}