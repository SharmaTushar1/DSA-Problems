/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null)
            return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        //[[1],]
        while (!q.isEmpty()) {
            int level = q.size();
            Node prev = null;
            for (int i=0; i<level; i++) {
                Node cur = q.poll();
                if (cur.left!=null) q.add(cur.left);
                if (cur.right!=null) q.add(cur.right);
                if (i!=0) prev.next = cur;
                if (i==level-1)
                    cur.next = null;
                prev = cur;
            }
        }
        return root;
    }
}