/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return rev(head, null);
    }
    
    public ListNode rev(ListNode q, ListNode p) {
        if (q == null)
            return p;
        ListNode r = q.next;
        q.next = p;
        return rev(r, q);
    }
}