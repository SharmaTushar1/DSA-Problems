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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (i!=null && j!=null) {
            if (i.val < j.val) {cur.next = i; i = i.next;}
            else {cur.next = j; j = j.next;}
            cur = cur.next;
        }
        if (i!=null) cur.next = i;
        else cur.next = j;
        return head.next;
    }
}