# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def recoverTree(self, root: TreeNode) -> None:
        self.first = None
        self.second = None
        self.prev = None
        
        self.inorder(root)
        
        self.first.val, self.second.val = self.second.val, self.first.val
    
    def inorder(self, node):
        if not node:
            return
        
        self.inorder(node.left)
        
        if self.prev and self.prev.val > node.val:
            if not self.first:
                self.first = self.prev
            self.second = node
        
        self.prev = node
        
        self.inorder(node.right)
