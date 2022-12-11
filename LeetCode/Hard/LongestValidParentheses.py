class Solution:
    def longestValidParentheses(self, s: str) -> int:
        if not s:
            return 0

        dp = [0] * len(s)
        longest = 0

        for i in range(1, len(s)):
            if s[i] == ')' and s[i - 1] == '(':
                dp[i] = (dp[i - 2] if i >= 2 else 0) + 2
            elif s[i] == ')' and s[i - 1] == ')' and i - dp[i - 1] > 0 and s[i - dp[i - 1] - 1] == '(':
                dp[i] = dp[i - 1] + ((dp[i - dp[i - 1] - 2] if i - dp[i - 1] >= 2 else 0) + 2)

            longest = max(longest, dp[i])

        return longest
