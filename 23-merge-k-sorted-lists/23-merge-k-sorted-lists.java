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
        int k = lists.length; 
        PriorityQueue<Integer> q = new PriorityQueue<>();
        //O(N) time
        for (int i = 0; i<k; i++) {
            while (lists[i]!=null) {
                q.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        while (!q.isEmpty()) {
            ListNode curr = new ListNode(q.poll());
            cur.next = curr;
            cur = cur.next;
        }
        return ans.next;
    }
}