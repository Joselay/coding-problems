class Solution:
    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:
        def dfs(x, y, visited):
            if x == y:
                return 1.0
            visited.add(x)
            for nxt in graph[x]:
                if nxt in visited:
                    continue
                visited.add(nxt)
                d = dfs(nxt, y, visited)
                if d > 0:
                    return d * weights[(x, nxt)]
            return -1.0

        graph = {}
        weights = {}
        for (x, y), val in zip(equations, values):
            if x in graph:
                graph[x].add(y)
            else:
                graph[x] = {y}
            if y in graph:
                graph[y].add(x)
            else:
                graph[y] = {x}
            weights[(x, y)] = val
            weights[(y, x)] = 1 / val
        res = []
        for x, y in queries:
            if x not in graph or y not in graph:
                res.append(-1.0)
            elif x == y:
                res.append(1.0)
            else:
                res.append(dfs(x, y, set()))
        return res
