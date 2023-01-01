class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        if not nums:
            return []
        res = []
        q = deque()
        for i, num in enumerate(nums):
            while q and nums[q[-1]] <= num:
                q.pop()
            q.append(i)
            if i >= k and q[0] <= i - k:
                q.popleft()
            if i >= k - 1:
                res.append(nums[q[0]])
        return res
