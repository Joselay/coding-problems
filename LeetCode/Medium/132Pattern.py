class Solution:
    def find132pattern(self, nums: List[int]) -> bool:
        third = float('-inf')
        stk = []
        for i in range(len(nums) - 1, -1, -1):
            if nums[i] < third:
                return True
            while stk and nums[i] > stk[-1]:
                third = stk.pop()
            stk.append(nums[i])
        return False
