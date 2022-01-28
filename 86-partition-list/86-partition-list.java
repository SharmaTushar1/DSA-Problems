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
    public ListNode partition(ListNode head, int x) {
       
        ListNode dummy1 = new ListNode(0);
        
        ListNode dummy2 = new ListNode(0);
        
        ListNode tempDummy = dummy1;
        
        ListNode tempDummy2 = dummy2;
        
        ListNode temp = head;
        
        while (temp!=null) {
            
            if (temp.val < x) {
                ListNode newNode = new ListNode(temp.val);
                tempDummy.next = newNode;
                tempDummy = tempDummy.next;
            }
            else {
                ListNode newNode = new ListNode(temp.val);
                tempDummy2.next = newNode;
                tempDummy2 = tempDummy2.next;
            }
            
            temp = temp.next;
        }
        
        tempDummy.next = dummy2.next;
                
        return dummy1.next;
         
    }
}