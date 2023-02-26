class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        result = 0
        n = len(columnTitle)
        for i in range(n):
            result += (ord(columnTitle[n-i-1]) - ord('A') + 1) * (26 ** i)
        return result
