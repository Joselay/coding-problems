class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        s = sum(nums)
        if s % 2 == 1:
            return False
        s //= 2
        dp = [False] * (s + 1)
        dp[0] = True
        for num in nums:
            for i in range(s, num-1, -1):
                dp[i] |= dp[i-num]
        return dp[s]
