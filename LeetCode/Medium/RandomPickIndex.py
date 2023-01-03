class Solution:
    def __init__(self, nums: List[int]):
        self.nums = nums
        self.indices = {}
        for i, num in enumerate(nums):
            if num not in self.indices:
                self.indices[num] = []
            self.indices[num].append(i)

    def pick(self, target: int) -> int:
        import random
        indices = self.indices[target]
        return random.choice(indices)
