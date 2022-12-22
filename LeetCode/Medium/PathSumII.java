import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        findPaths(root, sum - root.val, path, result);
        return result;
    }

    private void findPaths(TreeNode root, int sum, List<Integer> path, List<List<Integer>> result) {
        if (root.left == null && root.right == null && sum == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (root.left != null) {
            path.add(root.left.val);
            findPaths(root.left, sum - root.left.val, path, result);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            path.add(root.right.val);
            findPaths(root.right, sum - root.right.val, path, result);
            path.remove(path.size() - 1);
        }
    }
}
