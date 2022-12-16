import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    permute(nums, 0, result);
    return result;
  }

  private void permute(int[] nums, int start, List<List<Integer>> result) {
    if (start == nums.length) {
      List<Integer> permutation = new ArrayList<>();
      for (int num : nums) {
        permutation.add(num);
      }
      result.add(permutation);
      return;
    }

    for (int i = start; i < nums.length; i++) {
      swap(nums, start, i);
      permute(nums, start + 1, result);
      swap(nums, start, i);
    }
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
