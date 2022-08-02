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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        int height = findHeight(root, list);
        Collections.sort(list, (a,b)->Integer.compare(a.getKey(), b.getKey()));
        int j=0; 
        for (int i=1; i<=height; i++) {
            List<Integer> cur = new ArrayList<>();
            while (j<list.size() && list.get(j).getKey()==i) {
                cur.add(list.get(j).getValue());
                j++;
            }
            ans.add(cur);
        }
        return ans;
    }
    
    public int findHeight(TreeNode root, List<Pair<Integer, Integer>> list) {
        if (root == null) 
            return 0;
        int height = 1+Math.max(findHeight(root.left, list), findHeight(root.right, list));
        list.add(new Pair<Integer, Integer>(height, root.val));
        return height;
    }
}