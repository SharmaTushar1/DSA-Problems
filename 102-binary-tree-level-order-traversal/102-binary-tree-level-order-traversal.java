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
        //first create queue to store the values of the nodes
        Queue<TreeNode> queue = new LinkedList<>();
        //create a new 2d list which'll return the answer
        List<List<Integer>> wrapList = new LinkedList<>();
        //check whether the tree is null or not
        if (root == null) return wrapList;
        //otherwise push the root to the queue
        queue.offer(root);
        while (!queue.isEmpty()) {
            
            int levelNum = queue.size();
            //create another list to store the values of individual levels
            List<Integer> subList = new LinkedList<>();
            
            //now we'll have a loop which'll iterate queuelist number of times to have all the conditions checked
            for (int i = 0; i<levelNum; i++) {
                if (queue.peek().left!=null) queue.offer(queue.peek().left);
                if (queue.peek().right!=null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            
            wrapList.add(subList);       
            
        }
        return wrapList;
    
        
        
    }
}