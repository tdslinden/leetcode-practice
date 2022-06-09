class MyCircularQueue {

    private Deque<Integer> queue;
    private int capacity;
    
    public MyCircularQueue(int k) {
        queue = new ArrayDeque<>(k);
        capacity = k;
    }
    
    public boolean enQueue(int value) {
        if (queue.size() == capacity) {
            return false;
        }
        
        queue.addLast(value);
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        queue.removeFirst();
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue.getFirst();
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue.getLast();
    }
    
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    public boolean isFull() {
        return queue.size() == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */