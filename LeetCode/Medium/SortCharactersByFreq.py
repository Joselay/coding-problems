class Solution:
    def frequencySort(self, s: str) -> str:
        count = collections.Counter(s)
        sorted_chars = sorted(count.items(), key=lambda x: x[1], reverse=True)
        return "".join(char * freq for char, freq in sorted_chars)
