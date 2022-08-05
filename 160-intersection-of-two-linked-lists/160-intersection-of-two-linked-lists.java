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
//find the length of both. In the give figure 6 and 5
//But that will be complicated as we will have to assign different if else conditions for 
//cases as we don't know which one will be smaller.
//Watch this video for approach: https://www.youtube.com/watch?v=D0X0BONOQhI&ab_channel=NeetCode (don't see the code)
//They will travel the same distance
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1!=node2) {
            node1 = node1==null?headB:node1.next;
            node2 = node2==null?headA:node2.next;
        }
        return node1;//Either they will both be equal to null or same
    }
    
    
}