public static int search(int[] nums, int target) {
        // Handle empty array
        if (nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            // If the middle element is the target value, we're done
            if (nums[middle] == target) {
                return middle;
            }

            // If the middle element is greater than the rightmost element,
            // this means that the right half of the array is still in sorted order
            if (nums[middle] > nums[right]) {
                // If the target value is within the bounds of the right half of the array,
                // apply binary search to this subarray
                if (target > nums[middle] || target <= nums[right]) {
                    left = middle + 1;
                } else {
                    // Otherwise, apply binary search to the left half of the array
                    right = middle - 1;
                }
            }
            // If the middle element is less than the leftmost element,
            // this means that the left half of the array is still in sorted order
            else if (nums[middle] < nums[left]) {
                // If the target value is within the bounds of the left half of the array,
                // apply binary search to this subarray
                if (target < nums[middle] || target >= nums[left]) {
                    right = middle - 1;
                } else {
                    // Otherwise, apply binary search to the right half of the array
                    left = middle + 1;
                }
            }
            // If the middle element is greater than the target value,
            // apply binary search to the left half of the array
            else if (nums[middle] > target) {
                right = middle - 1;
            }
            // If the middle element is less than the target value,
            // apply binary search to the right half of the array
            else {
                left = middle + 1;
            }
        }

        // If we reach here, the target value is not in the array
        return -1;
    }
