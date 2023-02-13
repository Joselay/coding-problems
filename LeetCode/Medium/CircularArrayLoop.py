class Solution:
    def circularArrayLoop(self, nums: List[int]) -> bool:
        n = len(nums)
        for i in range(n):
            if nums[i] == 0:
                continue
            slow, fast = i, (i + nums[i] + n) % n
            direction = nums[i] > 0
            while nums[fast] * nums[i] > 0 and direction == nums[fast] > 0:
                if slow == fast:
                    if slow == (slow + nums[slow] + n) % n:
                        break
                    return True
                slow = (slow + nums[slow] + n) % n
                fast = (fast + nums[fast] + n) % n
                fast = (fast + nums[fast] + n) % n
            slow = i
            while nums[slow] * nums[i] > 0:
                next = (slow + nums[slow] + n) % n
                nums[slow] = 0
                slow = next
        return False
