# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if list1 == None and list2 == None:
            return None
        if list1 == None:
            return list2
        if list2 == None:
            return list1
        
        head = ListNode()
        current = head
        
        left = list1
        right = list2
        
        while (left != None and right != None):
            if (left.val < right.val):
                current.val = left.val
                left = left.next
            else:
                current.val = right.val
                right = right.next
            current.next = ListNode()
            current = current.next
            
        while (left != None):
            current.val = left.val
            if (left != None and left.next != None):
                current.next = ListNode()
                current = current.next
            left = left.next
        
        while (right != None):
            current.val = right.val
            if (right != None and right.next != None):
                current.next = ListNode()
                current = current.next
            right = right.next
            
        
        return head