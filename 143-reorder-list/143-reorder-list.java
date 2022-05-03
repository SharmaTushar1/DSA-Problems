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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverse(slow);
        ListNode cur = head;
        while (cur!=null && second!=null) {
            ListNode temp1 = cur.next;
            cur.next = second;
            ListNode temp2 = second.next;
            second.next = temp1;
            cur = temp1;
            second = temp2;
        }
        if (cur!=null) cur.next = null;
        
    }
    
    public ListNode reverse(ListNode head) {
        ListNode p = null;
        ListNode q = null;
        ListNode r = head;
        while (r!=null) {
            p = q;
            q = r;
            r = r.next;
            q.next = p;
        }
        return q;
    }
}