class Node:
    def __init__(self, key, value):
        self.key, self.val = key, value
        self.prev = self.next = None
        
class LRUCache:

    def __init__(self, capacity: int):
        self.cap = capacity
        self.cache = {} # map the key to point to the node
        
        # left=LRU, right = MRU
        self.left, self.right = Node(0, 0), Node(0, 0)
        self.left.next, self.right.prev = self.right, self.left

    def remove(self, node):
        prev = node.prev
        nxt = node.next
        prev.next = nxt
        nxt.prev = prev
    
    # insert from right
    def insert(self, node):            
        old_last = self.right.prev
        self.right.prev = node
        old_last.next = node
        node.next = self.right
        node.prev = old_last
        
    def get(self, key: int) -> int:
        if key not in self.cache:
            return -1
        
        self.remove(self.cache[key])
        self.insert(self.cache[key])
        return self.cache[key].val        

    def put(self, key: int, value: int) -> None:
        if key in self.cache:
            self.remove(self.cache[key])
        
        self.cache[key] = Node(key, value)
        self.insert(self.cache[key])
        
        if len(self.cache) > self.cap:
            lru = self.left.next
            self.remove(lru)
            del self.cache[lru.key]

# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)