class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        cnt = len(nums)//3
        if cnt == 0:
            return list(set(nums))
        res = []
        
        for i in range(len(nums)):
            if nums[i] in res:
                continue
            if nums.count(nums[i]) > cnt:
                res.append(nums[i])
        return res
