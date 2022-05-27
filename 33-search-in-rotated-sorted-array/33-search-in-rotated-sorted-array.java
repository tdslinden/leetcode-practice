class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        
        while (start < end) {
            int mid = (start + end) / 2;
            
            if (target == nums[mid]) {
                return mid;
            }
            
            if (nums[start] < nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target <= nums[end - 1] && target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        
        return -1;
    }
}