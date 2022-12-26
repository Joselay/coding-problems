class Solution:
    def convertToTitle(self, n: int) -> str:
        if n <= 0: return ""
        result = ""
        while n > 0:
            result += chr((n - 1) % 26 + ord('A'))
            n = (n - 1) // 26
        return result[::-1]
