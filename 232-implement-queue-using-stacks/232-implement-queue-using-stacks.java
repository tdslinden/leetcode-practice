class MyQueue {
    // when s2 is empty store here
    ArrayDeque<Integer> s1;
    ArrayDeque<Integer> s2;
        
    public MyQueue() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if (s1.size() == 0 && s2.size() == 0) {
            return -1;
        }
        
        if (s2.size() == 0) {
            while (s1.size() != 0) {
                s2.push(s1.pop());
            }
        }
        
        return s2.pop();
    }
    
    public int peek() {
        if (s2.size() == 0) {
            while (s1.size() != 0) {
                s2.push(s1.pop());
            }
        }
        
        return s2.peek();
    }
    
    public boolean empty() {
        return (s1.size() == 0 && s2.size() == 0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */