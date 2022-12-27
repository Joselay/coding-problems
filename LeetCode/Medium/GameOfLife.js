/**
 * @param {number[][]} board
 * @return {void} Do not return anything, modify board in-place instead.
 */
var gameOfLife = function(board) {
    let m = board.length;
    let n = board[0].length;
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            let count = 0;
            for (let ii = Math.max(i - 1, 0); ii <= Math.min(i + 1, m - 1); ii++) {
                for (let jj = Math.max(j - 1, 0); jj <= Math.min(j + 1, n - 1); jj++) {
                    count += board[ii][jj] & 1;
                }
            }
            count -= board[i][j] & 1;
            if (count === 3 || (count === 2 && board[i][j] === 1)) {
                board[i][j] |= 2;
            }
        }
    }
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            board[i][j] >>= 1;
        }
    }
};
