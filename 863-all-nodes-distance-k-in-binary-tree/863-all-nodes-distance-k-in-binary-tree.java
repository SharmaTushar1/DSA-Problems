/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        graphMaker(root, null, map);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        int distance = 0;
        HashSet<TreeNode> vis = new HashSet<>();
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i<size; i++) {
                TreeNode cur = q.poll();
                if (!vis.contains(cur)) {
                    if (cur.left!=null) q.add(cur.left);
                    if (cur.right!=null) q.add(cur.right);
                    if (map.get(cur)!=null) q.add(map.get(cur));
                    if (distance == k) 
                        ans.add(cur.val);
                }
                vis.add(cur);
            }
            distance++;
        }
        return ans;
    }
    
    public void graphMaker(TreeNode cur, TreeNode parent, HashMap<TreeNode, TreeNode> map) {
        if (cur==null) return;
        map.put(cur, parent);
        graphMaker(cur.left, cur, map);
        graphMaker(cur.right, cur, map);
    }
    
}