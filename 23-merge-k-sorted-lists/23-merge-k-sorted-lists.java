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
        if (lists.length == 0) {
            return null;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (ListNode list : lists) {
            ListNode current = list;
            while (current != null) {
                pq.offer(current.val);
                current = current.next;
            }
        }
        
        if (pq.size() == 0) {
            return null;
        } 
        return merge(pq);
    }
    
    public ListNode merge(PriorityQueue<Integer> pq) {
        ListNode head = new ListNode(pq.poll());
        ListNode current = head;
        while(pq.size() > 0) {
            current.next = new ListNode(pq.poll());
            current = current.next;
        }
        
        return head;
    }
}