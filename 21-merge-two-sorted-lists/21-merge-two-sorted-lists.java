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
        ListNode node = new ListNode(0);
        ListNode head = node;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        while (cur1!=null && cur2!=null) {
            if (cur2.val<cur1.val) {
                node.next = cur2;
                node = node.next;
                cur2 = cur2.next;
            } else {
                node.next = cur1;
                node = node.next;
                cur1 = cur1.next;
            }
        }
        if (cur1!=null) {
            node.next = cur1;
        }
        if (cur2!=null) {
            node.next = cur2;
        }
        return head.next;
    }
}