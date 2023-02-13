class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        m, n = len(s), len(p)
        if m < n: return []
        p_count = [0] * 26
        s_count = [0] * 26
        for i in range(n):
            p_count[ord(p[i]) - ord('a')] += 1
            s_count[ord(s[i]) - ord('a')] += 1
        res = []
        for i in range(n, m):
            if p_count == s_count:
                res.append(i - n)
            s_count[ord(s[i]) - ord('a')] += 1
            s_count[ord(s[i - n]) - ord('a')] -= 1
        if p_count == s_count:
            res.append(m - n)
        return res
