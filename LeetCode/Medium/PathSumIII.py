# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def pathSum(self, root: TreeNode, sum: int) -> int:
        self.ans = 0
        def helper(node, so_far, target):
            if not node: return
            if so_far + node.val == target:
                self.ans += 1
            helper(node.left, so_far + node.val, target)
            helper(node.right, so_far + node.val, target)
        
        def dfs(node, target):
            if not node: return
            helper(node, 0, target)
            dfs(node.left, target)
            dfs(node.right, target)
        
        dfs(root, sum)
        return self.ans
