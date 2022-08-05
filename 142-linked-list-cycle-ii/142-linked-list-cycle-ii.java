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
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = true;
        while (flag || fast!=slow) {
            if (flag) flag = false;
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = head;
        while (fast!=slow) {
            slow = slow.next;
            fast = fast.next;
            System.out.println(fast.val+" "+slow.val);
        }
        return fast;
    }
}