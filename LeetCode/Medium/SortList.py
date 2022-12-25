# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        
        slow = head
        fast = head.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        
        right = self.sortList(slow.next)
        slow.next = None
        left = self.sortList(head)
        
        return self.merge(left, right)
    
    def merge(self, left: ListNode, right: ListNode) -> ListNode:
        dummy = ListNode(0)
        curr = dummy
        while left and right:
            if left.val < right.val:
                curr.next = left
                left = left.next
            else:
                curr.next = right
                right = right.next
            curr = curr.next
        
        curr.next = left or right
        return dummy.next
