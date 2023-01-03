class Solution:
    def numberOfArithmeticSlices(self, A: List[int]) -> int:
        if len(A) < 3:
            return 0
        res = 0
        diff = A[1] - A[0]
        count = 2
        for i in range(2, len(A)):
            if A[i] - A[i-1] == diff:
                count += 1
            else:
                res += (count - 1) * (count - 2) // 2
                count = 2
                diff = A[i] - A[i-1]
        return res + (count - 1) * (count - 2) // 2
