class Solution:
    def findLadders(self, beginWord: str, endWord: str, wordList: List[str]) -> List[List[str]]:
        wordList = set(wordList)
        if endWord not in wordList:
            return []
        wordList.add(beginWord)
        wordList.add(endWord)
        wordLen = len(beginWord)
        dist = {}
        for word in wordList:
            dist[word] = float('inf')
        dist[beginWord] = 0
        prev = {}
        q = deque([beginWord])
        while q:
            currWord = q.popleft()
            currDist = dist[currWord] + 1
            for i in range(wordLen):
                for ch in string.ascii_lowercase:
                    if ch == currWord[i]:
                        continue
                    nextWord = currWord[:i] + ch + currWord[i + 1:]
                    if nextWord in wordList and dist[nextWord] > currDist:
                        dist[nextWord] = currDist
                        prev[nextWord] = [currWord]
                        q.append(nextWord)
                    elif nextWord in prev and dist[nextWord] == currDist:
                        prev[nextWord].append(currWord)
        return self.buildPaths(beginWord, endWord, prev)
    
    def buildPaths(self, beginWord, endWord, prev):
        if endWord not in prev:
            return []
        paths = [[endWord]]
        while paths[0][0] != beginWord:
            paths = [[word] + path for path in paths for word in prev[path[0]]]
        return paths
