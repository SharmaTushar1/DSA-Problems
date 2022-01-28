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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode rev1 = reverse(l1);
        ListNode rev2 = reverse(l2);

        return reverse(addTwoNumbers1(rev1, rev2));
        
        
        
        
    }
    
     public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
     
         int carry = 0;
         
         ListNode dummy = new ListNode(0);
         
         ListNode temp = dummy;
         
         while (l1!=null || l2!=null || carry!=0) {
             
             // System.out.println("hello");
             
             if (l1!=null) {
                 carry += l1.val;
                 l1 = l1.next;
             }
             if (l2!=null) {
                 carry += l2.val;
                 l2 = l2.next;
             }
             
             ListNode ans = new ListNode(carry%10);
             carry = carry/10;
             temp.next = ans;
             temp = temp.next;
             
         }
         
         return dummy.next;
         
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