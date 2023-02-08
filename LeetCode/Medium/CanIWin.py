class Solution:
    def canIWin(self, maxChoosableInteger: int, desiredTotal: int) -> bool:
        if (1 + maxChoosableInteger) * maxChoosableInteger // 2 < desiredTotal:
            return False
        self.memo = {}
        return self.helper(0, maxChoosableInteger, desiredTotal)
    
    def helper(self, state, maxChoosableInteger, desiredTotal):
        if desiredTotal <= 0:
            return False
        key = (state, desiredTotal)
        if key in self.memo:
            return self.memo[key]
        for i in range(maxChoosableInteger, 0, -1):
            if (state & (1 << i - 1)) == 0:
                if not self.helper(state | (1 << i - 1), maxChoosableInteger, desiredTotal - i):
                    self.memo[key] = True
                    return True
        self.memo[key] = False
        return False
