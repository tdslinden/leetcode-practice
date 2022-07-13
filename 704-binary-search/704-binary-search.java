class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length;
        int left = 0;
        
        return binarySearch(nums, left, right, target);
    }
    
    public int binarySearch(int[] nums, int left, int right, int target) {
        if (left >= right) {
            return -1;
        }
        
        int mid = (right + left) / 2;
        
        
        if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return binarySearch(nums, mid+1, right, target);
        } else {
            return binarySearch(nums, left, mid, target);
        }    
    }
}