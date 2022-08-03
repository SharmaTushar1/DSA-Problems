/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head==null || head.next==null || head.next.next==null) return false;
        ListNode fast = head;
        ListNode slow = head;
        boolean first = true;
        while (first || (fast!=null && fast.next!=null)) {
            if (!first && fast == slow) return true;
            if (first) first = false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}