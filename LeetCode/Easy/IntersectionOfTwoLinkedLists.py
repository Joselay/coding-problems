# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        if not headA or not headB: return None
        pa, pb = headA, headB
        while pa != pb:
            pa = headB if not pa else pa.next
            pb = headA if not pb else pb.next
        return pa
