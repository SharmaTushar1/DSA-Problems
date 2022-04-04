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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p1  = head;
        for (int i = 0; i<k-1; i++) {
            p1 = p1.next;
        }
        ListNode p2 = head;
        ListNode cur = head;
        int n = 0;
        while (cur!=null) {
            cur = cur.next;
            n++;
        }
        for (int i = 0; i<n-k; i++) {
            p2 = p2.next;
        }
        int temp = p1.val;
        p1.val = p2.val;
        p2.val = temp;
        return head;
    }
}