class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize variables to track the maximum sum and the current sum
        int maxSum = nums[0];
        int currentSum = nums[0];

        // Loop through the rest of the array
        for (int i = 1; i < nums.length; i++) {
            // Update the current sum by taking the maximum of the current element or the sum of the current element and the previous sum
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the maximum sum by taking the maximum of the current sum or the maximum sum so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
