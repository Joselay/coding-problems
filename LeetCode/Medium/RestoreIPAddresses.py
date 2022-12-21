class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:
        if len(s) > 12:
            return []
        
        res = []
        self.dfs(s, [], res)
        return res
    
    def dfs(self, s, path, res):
        if not s and len(path) == 4:
            res.append('.'.join(path))
            return
        if not s or len(path) == 4:
            return
        
        for i in range(1, 4):
            if i <= len(s):
                if int(s[:i]) > 255 or (i > 1 and s[0] == '0'):
                    continue
                self.dfs(s[i:], path + [s[:i]], res)
