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
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<k; i++) {
            while (lists[i]!=null) {
                list.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(list);
        ListNode ans = new ListNode(0);
        System.out.println(0);
        ListNode cur = ans;
        for (int i = 0; i<list.size(); i++) {
            ListNode curr = new ListNode(list.get(i));
            cur.next = curr;
            cur = cur.next;
        }
        // System.out.println(list);
        return ans.next;
    }
}