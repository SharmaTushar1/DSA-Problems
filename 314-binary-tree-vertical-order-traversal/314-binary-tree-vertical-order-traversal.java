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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<Pair<Integer, TreeNode>> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        q.add(new Pair(0, root));
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i=0; i<size; i++) {
                Pair<Integer, TreeNode> node = q.poll();
                map.putIfAbsent(node.getKey(), new ArrayList<>());
                map.get(node.getKey()).add(node.getValue().val);
                if (node.getValue().left!=null) 
                    q.add(new Pair(node.getKey()-1, node.getValue().left));
                if (node.getValue().right!=null) 
                    q.add(new Pair(node.getKey()+1, node.getValue().right));
            }
        }
        for (Map.Entry<Integer, ArrayList<Integer>> set: map.entrySet()) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i: set.getValue())
                list.add(i);
            ans.add(list);   
        }
        return ans;
    }
}