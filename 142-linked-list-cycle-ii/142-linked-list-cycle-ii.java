/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        
        int len = findLength(head);
        
        System.out.println(len);
        
        if (len != -1) {
            for (int i = 0; i<len; i++) {
                first = first.next;
            }
            
            while (first!=null && second != null) {
                if (first == second) {
                    return first;
                }
                first = first.next;
                second = second.next;
            }
            
        }
        return null;
        
    }
    
    public int findLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int len = -1;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                len = 1;
                ListNode temp = slow.next;
                while (temp!=slow) {
                    len++;
                    temp = temp.next;
                } 
                return len;
            }
        }
        return len;
    }
    
}