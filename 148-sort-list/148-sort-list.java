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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode prev = head;
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left,right);
    }
    
    public ListNode merge(ListNode first, ListNode second) {
        ListNode ans = new ListNode();
        ListNode cur = ans;
        while (first!=null && second!=null) {
            if (first.val<second.val) {
                cur.next = first;
                first=first.next;
                cur = cur.next;
            } else {
                cur.next = second;
                second=second.next;
                cur = cur.next;
            }
        }
        cur.next = first!=null?first:second;
        return ans.next;
    }
    
}