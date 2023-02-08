class Solution:
    def findTargetSumWays(self, nums: List[int], S: int) -> int:
        if not nums:
            return 0
        dp = [0] * (2 * nums[0] + 1)
        dp[nums[0] + nums[0]] = 1
        dp[nums[0] - nums[0]] += 1
        for i in range(1, len(nums)):
            ndp = [0] * (2 * nums[i] + 1)
            for j in range(-nums[i], nums[i] + 1):
                ndp[j + nums[i]] += dp[j + nums[i - 1]]
            dp = ndp
        return dp[S + nums[0]]
