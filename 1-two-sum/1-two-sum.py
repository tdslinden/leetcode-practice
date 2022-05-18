class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:        
        map = {}
        for i in range(len(nums)):
            num = nums[i]
            diff = target - nums[i]
            
            if diff in map:
                return [i, map[diff]]
                
            map[num] = i
        