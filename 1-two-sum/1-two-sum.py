class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:        
        map = {}
        ans = [0] * 2
        for i in range(len(nums)):
            num = nums[i]
            
            diff = target - num
            if diff in map:
                ans[0] = map[diff]
                ans[1] = i
            map[num] = i
            
        return ans
        