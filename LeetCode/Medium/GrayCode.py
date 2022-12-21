class Solution:
    def grayCode(self, n: int) -> List[int]:
        if n == 0:
            return [0]
        if n == 1:
            return [0, 1]
        
        prev_codes = self.grayCode(n - 1)
        codes = prev_codes + [x | (1 << (n - 1)) for x in reversed(prev_codes)]
        
        return codes
