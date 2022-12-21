# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def partition(self, head: ListNode, x: int) -> ListNode:
        dummy_smaller = ListNode(0)
        smaller = dummy_smaller
        dummy_greater = ListNode(0)
        greater = dummy_greater
        
        while head:
            if head.val < x:
                smaller.next = head
                smaller = smaller.next
            else:
                greater.next = head
                greater = greater.next
            head = head.next
        
        smaller.next = dummy_greater.next
        greater.next = None
        
        return dummy_smaller.next
