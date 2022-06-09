class MyCircularQueue {
    final int[] arr;
    private int front = 0;
    private int rear = -1;
    private int length = 0;
    private int capacity = 0;

    public MyCircularQueue(int k) {
        arr = new int[k];
        capacity = k;
    }
    
    public boolean enQueue(int value) {
        if (length == capacity) {
            return false;
        }
        
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        length++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        
        front = (front + 1) % capacity;
        length--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return length == 0;
    }
    
    public boolean isFull() {
        return length == capacity;
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