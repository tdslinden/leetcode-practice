class RandomizedSet:

    def __init__(self):
        self.map = {} # this will hold kv pairs with the value as the key and the index of the value in the arr as the value
        self.arr = [] # this will hold all the values
        self.pos = 0 
        
    def insert(self, val: int) -> bool:
        if val in self.map:
            return False
        
        self.arr.append(val)
        self.map[val] = self.pos
        self.pos += 1
        return True
        
    def remove(self, val: int) -> bool:
        if val not in self.map:
            return False
        
        last_index = self.pos - 1
        last_elem = self.arr[last_index]
        
        # get the index of the value we want to remove
        index_to_remove = self.map[val] 
        
        self.arr[index_to_remove] = last_elem
        self.map[last_elem] = index_to_remove
        
        self.map.pop(val)
        self.arr.pop()
        
        self.pos -= 1
        return True

    def getRandom(self) -> int:
        return random.choice(self.arr)


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()