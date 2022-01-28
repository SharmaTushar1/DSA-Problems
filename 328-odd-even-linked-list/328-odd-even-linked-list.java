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
    public ListNode oddEvenList(ListNode head) {
        
        if (head == null || head.next == null) return head;
        
        int count = 1;
        
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        
        ListNode temp1 = dummy1, temp2 = dummy2;
        
        while (head!=null) {
            if (count%2 == 0) {
                temp2.next = head;
                temp2 = temp2.next;
            } else {
                temp1.next = head;
                temp1 = temp1.next;
            }
                
            head = head.next;
            
            count++;
        }
        
        temp2.next = null;
        
        temp1.next = dummy2.next;
        
        return dummy1.next;
        
    }
}