class LRUCache:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.cache = {}
        self.lru = []

    def get(self, key: int) -> int:
        if key not in self.cache:
            return -1
        self.lru.remove(key)
        self.lru.append(key)
        return self.cache[key]

    def put(self, key: int, value: int) -> None:
        if key in self.cache:
            self.lru.remove(key)
        elif len(self.cache) == self.capacity:
            del self.cache[self.lru[0]]
            self.lru.pop(0)
        self.cache[key] = value
        self.lru.append(key)
