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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if (head == null || head.next==null || left==right) return head;
        
        ListNode leftPrev = head;
        
        if (left == 1) leftPrev = null;
        else {
            for (int i =2; i<left; i++) {
            leftPrev = leftPrev.next;
            }
        }
            
        ListNode leftNode = head;
        ListNode rightNode = head;
        
        for (int i =1; i<left; i++) {
            leftNode = leftNode.next;
        }
        
        for (int i =1; i<right; i++) {
            rightNode = rightNode.next;
        }
        
        ListNode rightNext = rightNode.next;
        
        ListNode p = rightNext;
        ListNode q = rightNext;
        ListNode r = leftNode;
        
        while (r!=rightNext) {
            p = q;
            q = r;
            r = r.next;
            q.next = p;
        }
        
        if (leftPrev!=null) leftPrev.next = q;
        else head = q;//If there's is no head then after reversing the ending part will become the head
        
        return head;      
        
    }
}