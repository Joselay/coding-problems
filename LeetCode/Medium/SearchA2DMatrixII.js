/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    if (!matrix.length) return false;
    let m = matrix.length;
    let n = matrix[0].length;
    let i = 0;
    let j = n - 1;
    while (i < m && j >= 0) {
        if (matrix[i][j] === target) return true;
        if (matrix[i][j] > target)
            j--;
        else
            i++;
    }
    return false;
};
