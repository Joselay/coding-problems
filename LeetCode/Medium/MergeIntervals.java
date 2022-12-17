class Solution {
    public int[][] merge(int[][] intervals) {
        // Check for edge cases
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        // Sort the intervals by their start times
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Initialize a list to store the merged intervals
        List<int[]> mergedIntervals = new ArrayList<>();

        // Add the first interval to the list
        mergedIntervals.add(intervals[0]);

        // Loop through the rest of the intervals
        for (int i = 1; i < intervals.length; i++) {
            // Get the last interval in the list
            int[] lastInterval = mergedIntervals.get(mergedIntervals.size() - 1);

            // If the current interval overlaps with the last interval, update the end time of the last interval to the maximum of the two end times
            if (lastInterval[1] >= intervals[i][0]) {
                lastInterval[1] = Math.max(lastInterval[1], intervals[i][1]);
            } else {
                // If the current interval does not overlap with the last interval, add it to the list
                mergedIntervals.add(intervals[i]);
            }
        }

        // Convert the list of merged intervals to an array and return it
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
