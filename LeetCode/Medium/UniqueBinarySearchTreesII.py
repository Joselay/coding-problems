# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def generateTrees(self, n: int) -> List[TreeNode]:
        if n == 0:
            return []
        
        return self.dfs(1, n + 1)
    
    def dfs(self, start, end):
        if start == end:
            return None
        res = []
        for i in range(start, end):
            for left in self.dfs(start, i) or [None]:
                for right in self.dfs(i + 1, end) or [None]:
                    node = TreeNode(i)
                    node.left = left
                    node.right = right
                    res.append(node)
        return res
