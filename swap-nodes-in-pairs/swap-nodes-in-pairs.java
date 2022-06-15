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
    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next == null) return head;
        if (head.next.next == null) {
            ListNode B = head.next;
            ListNode temp = B.next;
            B.next = head;
            head.next = temp;
            head = B;
            return head;
        }
        ListNode temp = head.next;
        return helper(head, head.next);
        
    }
    
    public ListNode helper(ListNode A, ListNode B) {
        if (A != null && B==null) return A;
        if (A == null || B == null) return null;
        ListNode temp = B.next;
        B.next = A;
        A.next = temp==null?null:helper(temp, temp.next);
        return B;
    }
    
}