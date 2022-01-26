/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        // int len = length(headA);
        
        ListNode tempB = headB;
        
        ListNode tempA = headA;
        
        while (tempA!=null) {
            tempB= headB;
            
            while (tempB != null) {
                
                if (tempA==tempB) return tempA;
                tempB = tempB.next;
                
            }
            tempA = tempA.next;
        }
        
        return null;
        
    }
    
//     public int length(ListNode node) {
        
//         count = 0;
//         ListNode temp = node;
        
//         while (node!=null) {
//             node = node.next;
//             count++;
//         }
//         node = temp;
        
//         return count;
        
        
//     }
    
    
}