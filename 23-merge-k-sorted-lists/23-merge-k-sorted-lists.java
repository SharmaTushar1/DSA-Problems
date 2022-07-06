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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> list = new PriorityQueue<>((a,b)->Integer.compare(a.val, b.val));
        for (ListNode l: lists) {
            ListNode head = l;
            while (head!=null) {
                list.offer(head);
                head = head.next;
            }
        }
        ListNode head = list.poll();
        ListNode ans = head;
        while (!list.isEmpty()) {
            ListNode cur = list.poll();
            ans.next = new ListNode(cur.val);
            ans = ans.next;
        }
        return head;
    }
}