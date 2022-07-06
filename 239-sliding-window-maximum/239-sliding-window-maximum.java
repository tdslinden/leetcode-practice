class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 1. Use a deque to store the indexes and make sure head has the largest number
        // 2. For each incoming element, we first check whether it's bigger than the nums[last element] of dq. If so, continue to remove nums[last element] of dq
        // 3. Check each head element to see if they are >= (end - k + 1) range. If not, remove head
        // 4. If end + 1 >= k, we update the result using nums[deque.peekFirst()] as head is always the big number's index

        Deque<Integer> deque = new ArrayDeque<>();
        int index = 0;
        int[] result = new int[nums.length - k + 1];
        
        for (int end = 0; end < nums.length; end++) { 
            int cur = nums[end];
            while (!deque.isEmpty() && nums[deque.peekLast()] < cur) { 
                deque.removeLast();
            }
            while (!deque.isEmpty() && deque.peekFirst() < end - k + 1) { 
                deque.removeFirst();
            }
            deque.addLast(end);
            
            if (end + 1 >= k) { //
                result[index++] = nums[deque.peekFirst()];
            }
        }
        
        return result;
    }
}