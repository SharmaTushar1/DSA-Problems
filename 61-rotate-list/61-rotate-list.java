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
    public ListNode rotateRight(ListNode head, int k) {
        int len = findLen(head);
        ListNode prev = head;
        ListNode cur = head;
        if (len == 0) return null;
        k %= len;
        if (k==0) return head;
        for (int i=0; i<len-k; i++) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = null;
        ListNode ans = cur;
        while (cur.next!=null) {
            cur = cur.next;
        }
        cur.next = head;
        return ans;
    }
    
    public int findLen(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while (temp!=null) {
            temp = temp.next;
            len++;
        }
        return len;
    }
    
}