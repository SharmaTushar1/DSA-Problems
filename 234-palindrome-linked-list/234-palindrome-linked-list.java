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
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = slow;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = reverse(slow);
        slow = prev.next;
        fast = head;
        prev = slow;
        while (slow!=null && fast!=prev) {
            if (slow.val!=fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode p = null;
        ListNode q = null;
        ListNode r = head;
        while (r!=null) {
            p = q;
            q=r;
            r=r.next;
            q.next = p;
        }
        return q;
    }
    
}