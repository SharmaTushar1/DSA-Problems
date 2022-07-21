/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node inorderSuccessor(Node x) {
        //check for the right value if present then the value will be in left's rightmost
        if (x.right!=null) {
            x = x.right;
            while (x.left!=null) 
                x = x.left;
            return x;
        }
        //basically find the node which is in the left
        //so just keep on traversing till the node is a left child
        while (x.parent != null && x.parent.right == x) {
            x = x.parent;
        }
        return x.parent;
    }
}