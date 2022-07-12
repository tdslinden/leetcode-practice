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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode left = list1;
        ListNode right = list2;
        ListNode head = new ListNode();
        ListNode current = head;
        
        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        
        while (left != null) {
            current.next = left;
            left = left.next;
            current = current.next;
        }
        
        while (right != null) {
            current.next = right;
            right = right.next;
            current = current.next;
        }
        
        return head.next;
    }
}