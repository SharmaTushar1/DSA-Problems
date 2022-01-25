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
        
        int len = length(head);
        
        if (head == null || head.next == null || k == 0 || k == len) return head;
        
        
        while (k>len) {
            k = k%len;
        }
        
        if (k == 0) return head;
        
        int index = len - k;
        
        ListNode indexPrev = head;
        
        for (int i =1; i<index; i++) {
            indexPrev = indexPrev.next;
        }
        
        ListNode indexElement = indexPrev.next;
        
        ListNode last = head;
        
        for (int i = 1; i<len; i++) {
            last = last.next;
        }
        
        last.next = head;
        
        indexPrev.next = null;
        
        head = indexElement;
        
        return head;
        
    }
    
    public int length(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp!=null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}