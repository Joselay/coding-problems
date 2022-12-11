public class Solution {
    public int maxArea(int[] height) {
        // Initialize variables to track the maximum area found so far and the
        // indices of the bars that form the sides of the rectangle with the
        // maximum area
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        // Iterate over the bars, moving the left and right pointers inward
        // until they meet in the middle
        while (left < right) {
            // Calculate the area of the rectangle formed by the current pair
            // of bars
            int area = (right - left) * Math.min(height[left], height[right]);

            // Update the maximum area if necessary
            if (area > maxArea) {
                maxArea = area;
            }

            // Move the left or right pointer inward, depending on which bar
            // has the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // Return the maximum area found
        return maxArea;
    }
}
