import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(k, n, 1, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int k, int n, int start, List<Integer> path, List<List<Integer>> res) {
        if (k == 0 && n == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (k == 0 || n <= 0) return;
        for (int i = start; i <= 9; i++) {
            path.add(i);
            dfs(k - 1, n - i, i + 1, path, res);
            path.remove(path.size() - 1);
        }
    }
}
