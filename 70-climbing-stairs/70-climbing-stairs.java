class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        
        int count = 0;
        int prev = 1;
        int curr = 2;
        
        for (int i = 3; i <= n; i++) {
            count = prev + curr;
            prev = curr;
            curr = count;
        }
        
        return curr;
    }
}