class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int length1 = nums1.length;
    int length2 = nums2.length;

    // If the length of nums1 is greater than the length of nums2, swap them
    // This ensures that nums1 is the shorter array
    if (length1 > length2) {
      int[] temp = nums1;
      nums1 = nums2;
      nums2 = temp;

      int tempLength = length1;
      length1 = length2;
      length2 = tempLength;
    }

    int low = 0;
    int high = length1;

    while (low <= high) {
      // Calculate the partitions of the two arrays
      int partition1 = (low + high) / 2;
      int partition2 = (length1 + length2 + 1) / 2 - partition1;

      // Calculate the maximum elements on the left side of each partition
      int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
      int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];

      // Calculate the minimum elements on the right side of each partition
      int minRight1 = (partition1 == length1) ? Integer.MAX_VALUE : nums1[partition1];
      int minRight2 = (partition2 == length2) ? Integer.MAX_VALUE : nums2[partition2];

      // If the partitions are correct, we have found the median
      if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
        if ((length1 + length2) % 2 == 0) {
          // If the total length of the two arrays is even, the median is the average of the two middle elements
          return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
        } else {
          // If the total length of the two arrays is odd, the median is the middle element
          return Math.max(maxLeft1, maxLeft2);
        }
      } else if (maxLeft1 > minRight2) {
        // If the left partition of nums1 is too large, move it to the left
        high = partition1 - 1;
      } else {
        // If the left partition of nums1 is too small, move it to the right
        low = partition1 + 1;
      }
    }

    // If the partitions are not correct, the input is invalid
    throw new IllegalArgumentException();
  }
}
