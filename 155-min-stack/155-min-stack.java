class MinStack {
    
    private int min;
    private List<Integer> stack;
    private int length;

    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new ArrayList<>();
        length = 0;
    }
    
    public void push(int val) {
        stack.add(val);
        length++;
        
        for (int num : stack) {
           if (num < min) {
               min = num;
           }
        }
    }
    
    public void pop() {
        if (length != 0) {
            int removed = stack.get(length - 1);
            if (min == removed) {
                min = Integer.MAX_VALUE;
            }
            stack.remove(length - 1);
            length--;
        }
    }
    
    public int top() {
        if (length != 0) {
            return stack.get(length - 1);
        }
        return -1;
    }
    
    public int getMin() {
        for (int num : stack) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */