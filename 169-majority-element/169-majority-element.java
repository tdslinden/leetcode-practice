class Solution {
    public int majorityElement(int[] nums) {
        int benchmark = nums.length / 2;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int key : map.keySet()) {
            if (map.get(key) > benchmark) {
                return key;
            }
        }
        
        return -1;
    }
}