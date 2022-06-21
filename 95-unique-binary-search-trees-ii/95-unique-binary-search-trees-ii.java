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
    public List<TreeNode> generateTrees(int n) {
        return helper(1, n);
    }
    
    public List<TreeNode> helper(int start, int end) {
        List<TreeNode> trees = new ArrayList<>();
        if (start>end) {
            trees.add(null);
            return trees;
        }
        for (int rootValue=start; rootValue<=end; rootValue++) {
            List<TreeNode> leftSubTrees = helper(start, rootValue-1);
            List<TreeNode> rightSubTrees = helper(rootValue+1, end);
            for (TreeNode leftSubTree: leftSubTrees) {
                for (TreeNode rightSubTree: rightSubTrees) {
                    TreeNode root = new TreeNode(rootValue);
                    root.left = leftSubTree;
                    root.right = rightSubTree;
                    trees.add(root);
                }
            }
        }
        return trees;
    }
    
}