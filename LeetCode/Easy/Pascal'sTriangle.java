class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        if (numRows == 0) {
            return pascalTriangle;
        }

        pascalTriangle.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = pascalTriangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);

            for (int j = 1; j < i; j++) {
                currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }

            currentRow.add(1);

            pascalTriangle.add(currentRow);
        }

        return pascalTriangle;
    }
}
