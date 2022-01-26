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
    public void reorderList(ListNode head) {
        
        
        ListNode mid = midFinder(head);
        
        ListNode hf = head;
        
        
        ListNode hs = reverse(mid);
        
        
        // System.out.print(hf.next.next.next.val);
        
        ListNode temp = new ListNode();
        
        while (hf!=null && hs!=null) {
            temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        
        
    }
     public ListNode midFinder(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
         ListNode mid = slow.next;
         slow.next = null;
        
        return mid;
        
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
}
    
   