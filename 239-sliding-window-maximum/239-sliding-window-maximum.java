class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 1. Use a deque to store the indexes and make sure head has the largest number
        // 2. For each incoming element, we first check whether it's bigger than the nums[last element] of dq. If so, continue to remove nums[last element] of dq
        // 3. Check each head element to see if they are >= (end - k + 1) range. If not, remove head
        // 4. If end + 1 >= k, we update the result using nums[deque.peekFirst()] as head is always the big number's index
        Deque<Integer> deque = new ArrayDeque<>();
        int index = 0;
        int[] result = new int[nums.length - k + 1];
        
        int left = 0;
        int right = 0;
        
        while (right < nums.length) {
            int cur = nums[right];
            
            while (!deque.isEmpty() && cur > nums[deque.peekLast()]) {
                deque.removeLast();
            }
            
            deque.addLast(right);
            
            if (left > deque.peekFirst()) {
                deque.removeFirst();
            }
            
            if (right + 1 >= k) { //
                result[index++] = nums[deque.peekFirst()];
                left++;
            }
            right++;
        }
        
        return result;
    }
}