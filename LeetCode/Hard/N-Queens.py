class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        def is_not_under_attack(row, col):
            return not (rows[col] or hills[row - col] or dales[row + col])
        
        def place_queen(row, col):
            rows[col] = 1
            hills[row - col] = 1  # "hill" diagonals
            dales[row + col] = 1  #"dale" diagonals

        def remove_queen(row, col):
            rows[col] = 0
            hills[row - col] = 0  # "hill" diagonals
            dales[row + col] = 0  #"dale" diagonals

        def backtrack(row = 0, count = 0, history = []):
            for col in range(n):
                if is_not_under_attack(row, col):
                    place_queen(row, col)
                    if row + 1 == n:
                        add_solution(history + [col])
                        count += 1
                    else:
                        count = backtrack(row + 1, count, history + [col])
                    remove_queen(row, col)
            return count
        
        def add_solution(history):
            board = []
            for col in history:
                board.append('.' * col + 'Q' + '.' * (n - col - 1))
            solutions.append(board)

        rows = [0] * n
        hills = [0] * (2 * n - 1)  # "hill" diagonals
        dales = [0] * (2 * n - 1)  #"dale" diagonals
        solutions = []
        backtrack()
        return solutions
