class Solution:
    def pacificAtlantic(self, matrix: List[List[int]]) -> List[List[int]]:
        if not matrix or not matrix[0]:
            return []
        m, n = len(matrix), len(matrix[0])
        p_visited = [[False] * n for _ in range(m)]
        a_visited = [[False] * n for _ in range(m)]
        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
        def dfs(visited, x, y):
            visited[x][y] = True
            for dx, dy in directions:
                new_x, new_y = x + dx, y + dy
                if 0 <= new_x < m and 0 <= new_y < n and not visited[new_x][new_y] and matrix[new_x][new_y] >= matrix[x][y]:
                    dfs(visited, new_x, new_y)
        
        for i in range(m):
            dfs(p_visited, i, 0)
            dfs(a_visited, i, n - 1)
        for j in range(n):
            dfs(p_visited, 0, j)
            dfs(a_visited, m - 1, j)
        
        res = []
        for i in range(m):
            for j in range(n):
                if p_visited[i][j] and a_visited[i][j]:
                    res.append([i, j])
        return res
