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
    public TreeNode balanceBST(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList();
        
        helperAdd(root, list);
        
        return helperCreate(list, 0, list.size()-1);
        
    }
    
    //here we'll use inorder traversal because using other traversal's won't give us a sorted look for 
    //example in example 2
    
    public void helperAdd(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        helperAdd(root.left, list);
        list.add(root.val);
        helperAdd(root.right, list);
    }
    
    public TreeNode helperCreate(ArrayList<Integer> list, int start, int end) {
        if (start>end) return null;
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = helperCreate(list, start, mid-1);
        node.right = helperCreate(list, mid+1, end);
        return node;
    }
    
}