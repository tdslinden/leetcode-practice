class MyQueue {
    
    private Deque<Integer> queued;
    private Deque<Integer> ready;
    
    public MyQueue() {
        queued = new ArrayDeque<>();
        ready = new ArrayDeque<>();
    }
    
    public void push(int x) {        
        if (ready.size() == 0 && queued.size() == 0) {
            ready.push(x);
        } else {
            queued.push(x);      
        }
    }
    
    public int pop() {
        peek();
        return ready.pop();
    }
    
    public int peek() {
        if (ready.size() == 0 && queued.size() >= 1) {
            while(queued.peek() != null) {
                ready.push(queued.pop());
            }
        } 
        return ready.peek();
    }
    
    public boolean empty() {
        return ready.size() == 0 && queued.size() == 0;
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