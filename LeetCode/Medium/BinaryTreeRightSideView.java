import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    private void dfs(TreeNode root, List<Integer> res, int depth) {
        if (root == null) return;
        if (depth == res.size()) {
            res.add(root.val);
        }
        dfs(root.right, res, depth + 1);
        dfs(root.left, res, depth + 1);
    }
}
