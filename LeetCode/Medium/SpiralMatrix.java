class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Create a list to store the result
        List<Integer> result = new ArrayList<>();

        // Check for edge cases
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        // Initialize variables to track the start and end indices of the rows and columns
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        // Loop until the start indices meet the end indices
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Add the elements in the top row from left to right
            for (int i = colStart; i <= colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;

            // Add the elements in the right column from top to bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            // Add the elements in the bottom row from right to left, if the row start is still less than or equal to the row end
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            // Add the elements in the left column from bottom to top, if the column start is still less than or equal to the column end
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][colStart]);
                }
                colStart++;
            }
        }

        return result;
    }
}
