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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1!=null || l2!=null) {
            sum+=carry;
            if (l1!=null) {
                sum+=l1.val;
                l1 = l1.next;
            }
            if (l2!=null) {
                sum+=l2.val;
                l2 = l2.next;
            }
            ListNode cur = new ListNode(sum%10);
            carry = sum/10;
            dummy.next = cur;
            dummy = dummy.next;
            sum = 0;
        }
        if (carry!=0)
            dummy.next = new ListNode(carry);
        return head.next;
    }
}