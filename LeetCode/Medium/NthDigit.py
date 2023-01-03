class Solution:
    def findNthDigit(self, n: int) -> int:
        size = 1
        count = 9
        while n > size * count:
            n -= size * count
            size += 1
            count *= 10
        num = 10 ** (size - 1) + (n - 1) // size
        return int(str(num)[(n - 1) % size])
