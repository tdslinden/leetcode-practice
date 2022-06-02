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
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    
    
    public ListNode reverse(ListNode current, ListNode newHead) {
        if (current == null) {
            return newHead;
        }
        
        ListNode savedNext = current.next;
        current.next = newHead;
        
        return reverse(savedNext, current);
    }
    
        
}