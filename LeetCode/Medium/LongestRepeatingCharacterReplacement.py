class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        if not s:
            return 0
        n = len(s)
        max_count = 0
        max_len = 0
        start = 0
        counts = [0] * 26
        for end in range(n):
            counts[ord(s[end]) - ord('A')] += 1
            max_count = max(max_count, counts[ord(s[end]) - ord('A')])
            while end - start + 1 - max_count > k:
                counts[ord(s[start]) - ord('A')] -= 1
                start += 1
            max_len = max(max_len, end - start + 1)
        return max_len
