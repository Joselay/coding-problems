# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseBetween(self, head: ListNode, m: int, n: int) -> ListNode:
        if not head:
            return None
        
        dummy = ListNode(0)
        dummy.next = head
        prev = dummy
        
        for _ in range(m - 1):
            prev = prev.next
        curr = prev.next
        
        for _ in range(n - m):
            temp = curr.next
            curr.next = temp.next
            temp.next = prev.next
            prev.next = temp
        
        return dummy.next
