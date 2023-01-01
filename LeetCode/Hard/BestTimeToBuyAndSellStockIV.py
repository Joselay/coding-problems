class Solution:
    def maxProfit(self, k: int, prices: List[int]) -> int:
        if not prices:
            return 0
        if k >= len(prices) // 2:
            return self.maxProfitUnlimitedTransactions(prices)
        dp = [[0] * len(prices) for _ in range(k + 1)]
        for i in range(1, k + 1):
            maxDiff = -prices[0]
            for j in range(1, len(prices)):
                dp[i][j] = max(dp[i][j - 1], prices[j] + maxDiff)
                maxDiff = max(maxDiff, dp[i - 1][j] - prices[j])
        return dp[k][-1]
    
    def maxProfitUnlimitedTransactions(self, prices: List[int]) -> int:
        res = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i - 1]:
                res += prices[i] - prices[i - 1]
        return res
