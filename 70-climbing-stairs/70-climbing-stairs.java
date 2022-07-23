class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        
        if (n == 2) {
            return 2;
        }
        
        int steps = 0;
        int first = 1;
        int second = 2;
        
        for (int i = 3; i <= n; i++) {
            steps = first + second;
            first = second;
            second = steps;
        }
        
        return steps;
    }
}