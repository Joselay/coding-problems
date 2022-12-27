/**
 * @param {number[][]} matrix
 * @return {number}
 */
var NumMatrix = function(matrix) {
    this.matrix = matrix;
    this.sums = new Array(matrix.length + 1);
    for (let i = 0; i < this.sums.length; i++) {
        this.sums[i] = new Array(matrix[0].length + 1).fill(0);
    }
    for (let i = 1; i < this.sums.length; i++) {
        for (let j = 1; j < this.sums[0].length; j++) {
            this.sums[i][j] = this.sums[i - 1][j] + this.sums[i][j - 1] - this.sums[i - 1][j - 1] + matrix[i - 1][j - 1];
        }
    }
};

/**
 * @param {number} row1
 * @param {number} col1
 * @param {number} row2
 * @param {number} col2
 * @return {number}
 */
NumMatrix.prototype.sumRegion = function(row1, col1, row2, col2) {
    return this.sums[row2 + 1][col2 + 1] - this.sums[row1][col2 + 1] - this.sums[row2 + 1][col1] + this.sums[row1][col1];
};
