class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // edge case: intervals is empty
        if (intervals.length == 0) {
            return new int[][] {newInterval};
        }

        // create a list to store the result
        List<int[]> result = new ArrayList<>();

        // add all the intervals before the new interval
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // merge all the overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        // add the new interval to the result
        result.add(newInterval);

        // add all the remaining intervals
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }

        // convert the list to an array and return the result
        return result.toArray(new int[result.size()][]);
    }
}
