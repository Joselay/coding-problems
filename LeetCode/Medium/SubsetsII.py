class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        def backtrack(start, path):
            res.append(path)
            for i in range(start, len(nums)):
                if i > start and nums[i] == nums[i-1]:
                    continue
                backtrack(i+1, path+[nums[i]])
        
        nums.sort()
        res = []
        backtrack(0, [])
        
        return res
