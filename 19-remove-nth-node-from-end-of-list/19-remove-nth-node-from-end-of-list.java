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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int len = 0;
        while (cur!=null) {
            cur = cur.next;
            len++;
        }
        if (n == len) return head.next;
        if (n==1) {
            cur = head;
            for (int i = 1; i<len-1; i++) {
                cur = cur.next;
            }
            cur.next = null;
            return head;
        } 
        int j = len-n;
        ListNode prev = head;
        for (int i = 1; i<j; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}