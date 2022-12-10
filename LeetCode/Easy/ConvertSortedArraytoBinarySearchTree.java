/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
    return sortedArrayToBST(nums, 0, nums.length - 1);
  }

  public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    }

    int mid = start + (end - start) / 2;

    // Create the left subtree
    TreeNode left = sortedArrayToBST(nums, start, mid - 1);

    // Create the right subtree
    TreeNode right = sortedArrayToBST(nums, mid + 1, end);

    // Create the root node and link the left and right subtrees
    TreeNode root = new TreeNode(nums[mid]);
    root.left = left;
    root.right = right;

    return root;
  }
}
