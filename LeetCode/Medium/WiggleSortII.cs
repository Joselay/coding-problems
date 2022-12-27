public class Solution {
    public void WiggleSort(int[] nums) {
        int n = nums.Length;
        int median = FindKthLargest(nums, (n + 1) / 2);
        int left = 0, right = n - 1;
        int i = 0;
        while (i <= right) {
            if (nums[NewIndex(i, n)] > median) {
                Swap(nums, NewIndex(left++, n), NewIndex(i++, n));
            } else if (nums[NewIndex(i, n)] < median) {
                Swap(nums, NewIndex(right--, n), NewIndex(i, n));
            } else {
                i++;
            }
        }
    }
    
    private int NewIndex(int index, int n) {
        return (1 + 2 * index) % (n | 1);
    }
    
    private void Swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private int FindKthLargest(int[] nums, int k) {
        int left = 0, right = nums.Length - 1;
        while (left <= right) {
            int pivotIndex = Partition(nums, left, right);
            if (pivotIndex == k - 1) {
                return nums[pivotIndex];
            } else if (pivotIndex > k - 1) {
                right = pivotIndex - 1;
            } else {
                left = pivotIndex + 1;
            }
        }
        return -1;
    }
    
    private int Partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (nums[j] > pivot) {
                i++;
                Swap(nums, i, j);
            }
        }
        Swap(nums, i + 1, right);
        return i + 1;
    }
}
