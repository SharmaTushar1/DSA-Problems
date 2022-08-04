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
        //first find the size
        //find the same index (but from start)
        //use 3 pointer method
        int sz = listSize(head);
        if (sz==1) return null;
        int index = sz-n;
        if (index==0) return head.next;
        ListNode temp = head;
        for (int i=1; i<index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    
    public int listSize(ListNode head) {
        ListNode cur = head;
        int len = 0;
        while (cur!=null) {
            len++;
            cur = cur.next;
        }
        return len;
    }
    
}