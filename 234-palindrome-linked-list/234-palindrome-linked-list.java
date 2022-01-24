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
    
    public ListNode findMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast!= null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
        
    }
    
    public ListNode reverse(ListNode head) {
        ListNode p = null;
        ListNode q = null;
        ListNode r = head;
        while (r!=null) {
            p = q;
            q = r;
            r = r.next;
            q.next = p;
        }
        
        return q;
    }
    
    public boolean isPalindrome(ListNode head) {
        
        ListNode mid = findMid(head);
        ListNode rev = reverse(mid);
        // ListNode rerev = rev;
//         
        while (rev!=null) {
            if (head.val!=rev.val) return false;
            rev = rev.next;
            head = head.next;
        }
        
        return true;
        
        
        
    }
}