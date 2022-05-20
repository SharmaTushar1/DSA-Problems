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
    public ListNode insertionSortList(ListNode head) {
        ListNode i = head;
        while (i != null) {
            ListNode p = null;
            ListNode q = head;
            while (q!=i) {
                p = q;
                q = q.next;
                if (p.val>i.val) {
                    int temp = p.val; 
                    p.val = i.val;
                    i.val = temp;
                }
            }
            i = i.next;
        }
        return head;
    }
}