class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            if (map.containsKey(diff) && map.get(diff) != i) {
                ans[0] = map.get(diff);
                ans[1] = i;
                return ans;
            }
            
            map.put(nums[i], i);
        }
        
        return ans;
    }
}