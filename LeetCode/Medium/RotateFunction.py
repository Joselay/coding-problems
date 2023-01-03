class Solution:
    def maxRotateFunction(self, A: List[int]) -> int:
        if not A:
            return 0
        n = len(A)
        s = sum(A)
        fi = sum(i * A[i] for i in range(n))
        ans = fi
        for i in range(1, n):
            fi += s - n * A[-i]
            ans = max(ans, fi)
        return ans
