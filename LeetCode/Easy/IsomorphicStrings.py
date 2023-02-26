class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
    
        s_to_t = {}
        for i in range(len(s)):
            if s[i] not in s_to_t:
                if t[i] in s_to_t.values():
                    return False
                s_to_t[s[i]] = t[i]
            elif s_to_t[s[i]] != t[i]:
                return False
    
        return True
