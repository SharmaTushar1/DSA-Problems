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
    private TreeNode constructBinaryTree(int[] preorder, int[] inorder, int[] index, int stop){
        if(index[0] >= preorder.length)
            return null;
        
        if(inorder[index[1]] == stop){
            index[1]++;
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[index[0]++]);
        root.left = constructBinaryTree(preorder,inorder, index, root.val);
        root.right = constructBinaryTree(preorder,inorder, index, stop);
        
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] index = new int[2];
        return constructBinaryTree(preorder,inorder, index, Integer.MIN_VALUE);
    }
}