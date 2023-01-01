class Solution:
    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        wordList = set(wordList)
        if endWord not in wordList:
            return 0
        wordLen = len(beginWord)
        q = deque([beginWord])
        dist = {beginWord: 1}
        while q:
            currWord = q.popleft()
            currDist = dist[currWord] + 1
            for i in range(wordLen):
                for ch in string.ascii_lowercase:
                    if ch == currWord[i]:
                        continue
                    nextWord = currWord[:i] + ch + currWord[i + 1:]
                    if nextWord in wordList:
                        if nextWord == endWord:
                            return currDist
                        if nextWord not in dist:
                            dist[nextWord] = currDist
                            q.append(nextWord)
        return 0
