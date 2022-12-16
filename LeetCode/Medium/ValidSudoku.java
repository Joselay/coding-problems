class Solution {
    public boolean isValidSudoku(char[][] board) {
 
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] squares = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }
        

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.') {
            
                    if (rows[i].contains(current) || columns[j].contains(current) || squares[(i / 3) * 3 + j / 3].contains(current)) {
                        return false;
                    }
            
                    rows[i].add(current);
                    columns[j].add(current);
                    squares[(i / 3) * 3 + j / 3].add(current);
                }
            }
        }
        
        return true;
    }
}
