/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public int Rob(TreeNode root) {
        int[] res = Dfs(root);
        return Math.Max(res[0], res[1]);
    }
    
    private int[] Dfs(TreeNode node) {
        if (node == null) return new int[2] { 0, 0 };
        int[] left = Dfs(node.left);
        int[] right = Dfs(node.right);
        int[] res = new int[2];
        res[0] = Math.Max(left[0], left[1]) + Math.Max(right[0], right[1]);
        res[1] = left[0] + right[0] + node.val;
        return res;
    }
}
