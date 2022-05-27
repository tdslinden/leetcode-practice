class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        
        while (start < end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        
        return -1;
    }
}