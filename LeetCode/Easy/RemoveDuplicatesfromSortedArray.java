class Solution {
   public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int currentNonDuplicate = nums[0];
    int uniqueCount = 1;
    for (int i = 1; i < nums.length; i++)
        if (nums[i] != currentNonDuplicate) {
            nums[uniqueCount] = nums[i];
            currentNonDuplicate = nums[i];
            uniqueCount++;
        }

    return uniqueCount;
    }
}
