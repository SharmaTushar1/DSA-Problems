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
        
        if (head.next==null) return null;
        
        int index = length(head) - n+1;

        if (n == 1) {
            ListNode temp = head;
            while (temp.next.next !=null) {
                temp = temp.next;
            }
            temp.next = null;
            return head;
        } else if (n==length(head)) {head = head.next; return head;}
        
        ListNode prevNode = head;
        
        ListNode nodeToDel = head;
        
        for (int i = 1; i<=index-2; i++) {
            prevNode = prevNode.next;
        }
        
                System.out.println(index);
        System.out.println(prevNode.val);
        
        // nodeToDel = head;/
        
        // for  (int i = 1; i<=index-1; i++) {
            nodeToDel = prevNode.next;
        
        ListNode link = head;
        
        link = nodeToDel.next;
        
        prevNode.next = link;
        return head;
        
    }
    
    public int length(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;        
    }
}