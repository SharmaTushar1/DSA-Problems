class Solution {
    public int maxAncestorDiff(TreeNode root) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] res = new int[1];
        helper(root, min, max, res);
        return res[0];
    }
    
    public void helper(TreeNode root, int min, int max, int[] res) {
        if (root == null) return;
        min = Math.min(root.val, min);
        max = Math.max(root.val, max);
        res[0] = Math.max(res[0], (max-min));
        helper(root.left, min, max, res);
        helper(root.right, min, max, res);
    }
    
}