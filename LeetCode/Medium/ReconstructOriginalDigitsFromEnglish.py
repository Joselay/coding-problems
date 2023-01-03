class Solution:
    def originalDigits(self, s: str) -> str:
        counts = collections.Counter(s)
        nums = [0] * 10
        nums[0] = counts['z']
        nums[2] = counts['w']
        nums[4] = counts['u']
        nums[6] = counts['x']
        nums[8] = counts['g']
        nums[3] = counts['h'] - nums[8]
        nums[5] = counts['f'] - nums[4]
        nums[7] = counts['v'] - nums[5]
        nums[9] = counts['i'] - nums[5] - nums[6] - nums[8]
        nums[1] = counts['n'] - nums[7] - 2 * nums[9]
        res = ''
        for i, num in enumerate(nums):
            res += str(i) * num
        return res
