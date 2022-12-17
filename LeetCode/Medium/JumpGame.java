class Solution {
    public boolean canJump(int[] nums) {
        // Initialize a variable to track the maximum reachable index
        int maxReachableIndex = 0;

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current index is greater than the maximum reachable index, return false
            if (i > maxReachableIndex) {
                return false;
            }

            // Update the maximum reachable index by taking the maximum of the current value of the maximum reachable index and the current index plus the value at the current index
            maxReachableIndex = Math.max(maxReachableIndex, i + nums[i]);
        }

        return true;
    }
}
