class MyStack {
    
    private Deque<Integer> q1;
    private Deque<Integer> q2;
    private int top;
    
    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q1.addLast(x);
        top = x;
    }
    
    public int pop() {
        while (q1.size() > 1) {
            top = q1.removeFirst();
            q2.addLast(top);
        }
        
        int value = q1.removeFirst();
        
        Deque<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return value;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */