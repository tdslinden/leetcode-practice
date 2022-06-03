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
        if (lists.length == 0 || lists == null) {
            return null;
        }
        
        return divide(lists, 0, lists.length-1);
        
    }
    
    public ListNode divide(ListNode[] lists, int start, int end) {
        if (end - start == 0) {
            return lists[start];
        }
        if (end - start == 1) {
            return mergeLists(lists[start], lists[end]);
        }
        
        int mid = start + ((end - start) / 2);
        ListNode l1 = divide(lists, start, mid);
        ListNode l2 = divide(lists, mid+1, end);
        
        return mergeLists(l1, l2);
    }
    
    public ListNode mergeLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curr = head;
            
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        
        if (list1 != null) {
            curr.next = list1;
        }
        
        if (list2 != null) {
            curr.next = list2;
        }
        
        return head.next;
    }
}