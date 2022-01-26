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
    
    //optimized approach link to explanation - https://leetcode.com/problems/intersection-of-two-linked-lists/discuss/49785/Java-solution-without-knowing-the-difference-in-len!/165648
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if (headA == null || headB == null) return null;
        
        ListNode a = headA;
        ListNode b = headB;
        
        while (a != b) {
            
            a = a ==null?headB:a.next;
            b = b==null?headA:b.next;
            
        }
        
        return a;
        
    }
    
    //Brute force approach
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
//         // int len = length(headA);
        
//         ListNode tempB = headB;
        
//         ListNode tempA = headA;
        
//         while (tempA!=null) {
//             tempB= headB;
            
//             while (tempB != null) {
                
//                 if (tempA==tempB) return tempA;
//                 tempB = tempB.next;
                
//             }
//             tempA = tempA.next;
//         }
        
//         return null;
        
//     }
    
}