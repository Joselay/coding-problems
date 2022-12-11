class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        # sort the input array in ascending order
        nums.sort()
        result = []
        n = len(nums)
        
        # loop through the array, starting from the first element
        for i in range(n):
            # skip duplicates to avoid adding the same triplet multiple times
            if i > 0 and nums[i] == nums[i-1]:
                continue
                
            # initialize the left and right pointers
            left = i + 1
            right = n - 1
            
            # loop until the left pointer is less than the right pointer
            while left < right:
                # calculate the sum of the current elements pointed by the left and right pointers,
                # and the current element pointed by the i pointer
                s = nums[i] + nums[left] + nums[right]
                
                # if the sum is equal to 0, add the current triplet to the result
                if s == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    
                    # skip duplicates to avoid adding the same triplet multiple times
                    while left < right and nums[left] == nums[left+1]:
                        left += 1
                    while left < right and nums[right] == nums[right-1]:
                        right -= 1
                        
                    # move the left and right pointers to the next elements
                    left += 1
                    right -= 1
                    
                # if the sum is less than 0, move the left pointer to the next element
                elif s < 0:
                    left += 1
                    
                # if the sum is greater than 0, move the right pointer to the previous element
                else:
                    right -= 1
                    
        return result
