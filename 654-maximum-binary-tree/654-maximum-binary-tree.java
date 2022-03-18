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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    
    public TreeNode helper(int[] nums, int start, int end) {
        
        if (start>end) return null;
        
        int maxInd = maxIndex(nums, start, end);
        
        TreeNode node = new TreeNode(nums[maxInd]);
        
        node.left = helper(nums, start, maxInd-1);
        
        node.right = helper(nums, maxInd+1, end);
        
        return node;
        
    }
    
    public int maxIndex(int[] nums, int start, int end) {
        int maxValue = -999;
        int maxIndex = 0;
        for (int i = start; i<=end; i++) {
            if (nums[i]>maxValue) {
                maxIndex = i;
                maxValue = nums[maxIndex];
            }
        }
        return maxIndex;
    }
    
}